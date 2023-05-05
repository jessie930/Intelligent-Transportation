package com.intelligenttransportation;


import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class BrokerConnection extends AppCompatActivity {

    public static final String SUB_TOPIC = "group9_outTopic";

    public static final String LOCALHOST = "broker.emqx.io";
    private static final String MQTT_SERVER = "tcp://" + LOCALHOST+ ":1883";
    public static final String CLIENT_ID = "Android App";
    public static final int QOS = 0;

    private boolean isConnected = false;
    private MqttClient mqttClient;
    Context context;
    TextView connectionMessage;

    public BrokerConnection(Context context) {
        this.context = context;
        mqttClient = new MqttClient(context, MQTT_SERVER, CLIENT_ID);
        connectToMqttBroker();
    }

    public void connectToMqttBroker() {
        if (!isConnected) {
            mqttClient.connect(CLIENT_ID, "", new IMqttActionListener() {

                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    isConnected = true;
                    final String successfulConnection = "Connected to MQTT broker";
                    Log.i(CLIENT_ID, successfulConnection);
                    Toast.makeText(context, successfulConnection, Toast.LENGTH_LONG).show();
                    mqttClient.subscribe(SUB_TOPIC, QOS, null);
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    final String failedConnection = "Failed to connect to MQTT broker";
                    Log.e(CLIENT_ID, failedConnection);
                    Toast.makeText(context, failedConnection, Toast.LENGTH_SHORT).show();
                }
            }, new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    isConnected = false;

                    final String connectionLost = "Connection to MQTT broker lost";
                    Log.w(CLIENT_ID, connectionLost);
                    Toast.makeText(context, connectionLost, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    String payload = new String(message.getPayload());
                    Log.d(CLIENT_ID, "Message received: " + payload);
                    Toast.makeText(context, "Message received: " + payload, Toast.LENGTH_SHORT).show();
                    DisplayUtils.showDynamicPage(message.toString());

                    if (topic.equals(SUB_TOPIC) || (connectionMessage != null)) {
                        String messageMQTT = message.toString();
                        connectionMessage.setText(messageMQTT);
                        Log.i(CLIENT_ID, "Message" + messageMQTT);  // prints in the console
                    } else {
                        // prints in the console
                        Log.i(CLIENT_ID, "[MQTT] Topic: " + topic + " | Message: " + message.toString());
                    }
                }
                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    Log.d(CLIENT_ID, "Message delivered");
                }
            });
        }
    }

    public void setConnectionMessage(TextView textView) {
        this.connectionMessage = textView;
    }

    public void setConnectionMessage(TextView textView_east, TextView textView_north, ImageView light_east,
                                     ImageView light_west,ImageView light_north,ImageView light_south,
                                     ImageView light_east_west,ImageView light_north_south) {
        DisplayUtils.setViewsID(textView_east, textView_north, light_east,light_west,light_north,light_south,light_east_west,light_north_south);
    }

    public MqttClient getMqttClient() {
        return mqttClient;
    }



}
