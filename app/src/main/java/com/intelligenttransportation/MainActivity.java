package com.intelligenttransportation;

<<<<<<< app/src/main/java/com/intelligenttransportation/MainActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
=======
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttMessage;

    Button userB,autoMobileConsoleB,trafficLightB;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button userB= findViewById(R.id.userButton);
        Button autoMobileConsoleB= findViewById(R.id.autoMoConButton);
        Button trafficLightB= findViewById(R.id.trafficLightButton);


        //Create the users objects
        Controller.addUser("Jessei","1234","Admin");
        Controller.addUser("Elif","1234", "Admin");
        Controller.addUser("Tehreem","1234","General user");
        Controller.addUser("YenigChao","1234","General user");
        Controller.addUser("Hasson","1234", "General user");

        userB.setOnClickListener(this);
        autoMobileConsoleB.setOnClickListener(this);
        trafficLightB.setOnClickListener(this);
    }
    @Override

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.userButton:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.autoMoConButton:
                Intent intent2 = new Intent(this, UserActivity.class);
                startActivity(intent2);
                break;
            case R.id.trafficLightButton:
                Intent intent3 = new Intent(this, TrafficLightActivity.class);
                startActivity(intent3);
                break;


        }

        Button viewLightButton = findViewById(R.id.button_view_light);
        viewLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (1 == 0) { // This part should change to if user.loginStatus == 0
                    intent = new Intent(MainActivity.this, TrafficLightUserActivity.class);
                }
                if (1 == 1) { // This part should change to if user.loginStatus == 1
                    intent = new Intent(MainActivity.this, TrafficLightAdminActivity.class);
                }
                startActivity(intent);
            }
        });


        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = null;
                switch (item.getItemId()) {
                    case R.id.navigation_car_console:
                        intent = new Intent(MainActivity.this, CarConsoleActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_user:
                        intent = new Intent(MainActivity.this, UserActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });

    }
}