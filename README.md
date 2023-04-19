# Intelligent transportation



## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://git.chalmers.se/courses/dit113/2023/group-9/intelligent-transportation.git
git branch -M main
git push -uf origin main
```

## Integrate with your tools

- [ ] [Set up project integrations](https://git.chalmers.se/courses/dit113/2023/group-9/intelligent-transportation/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***


## Name

- ### Intelligent Transportation

## Description
- In contemporary society, with the increasing number of cars on the road, the demand for transportation intelligence is also on the rise. Intelligent transportation is designed to leverage technology and algorithms to improve traffic operation efficiency, reduce congestion and improve traffic safety.

- Intelligent transportation systems include three parts: Adaptive Traffic Light System(ATLS), Advanced Driving Assistance System(ADAS), and intelligent transportation application.

- The ATLS is to implement adaptive traffic light adjustment that senses traffic congestion and gives priority to vehicles in the direction of congestion. This can enhance the efficiency of road traffic and reduce congestion.

- With regards to ADAS, distance sensing technology, by detecting surrounding vehicles or objects, can be implemented to help drivers better assess their surroundings. Ideally, early warning systems can be put in place to alert drivers of potential collisions during the driving process, thereby reducing the incidence of traffic accidents and improving driving safety.

- The intelligent transportation app is an application developed based on the Android platform. Users can view the remaining time of the current traffic light, distance sensing information, and real-time alarm information of the car through the APP. Traffic administrator users can use the app to control the current traffic lights.

## Badges
- /appveyor/tests/:user/:repo
- /appveyor/tests/:user/:repo/:branch
- /eclipse-marketplace/dt/:name
- /bitbucket/issues/:user/:repo
- /amo/stars/:addonId
- /bugzilla/:bugNumber

## System design diagram

![image](https://git.chalmers.se/courses/dit113/2023/group-9/intelligent-transportation/-/raw/main/img/Intelligent%20transportation%20system%20design%20diagram.png)


## Installation
1. Install Gitlab on your computer
 - You can download GitLab from the official website: https://about.gitlab.com/install/.
2. Install the Arduino IDE
 - You can download the Arduino IDE from the official website: https://www.arduino.cc/en/software/.
3. Install Mosquitto
 - Mosquitto is an open-source message broker that is used for the communication between devices in the intelligent transportation system. You can download Mosquitto from the official website: https://mosquitto.org/download/.
4. Install Android Studio
 - Android Studio is required to build and run the Android application for the intelligent transportation system. You can download Android Studio from the official website: https://developer.android.com/studio.
5. Sign up for Tinkercad and connect your microcontroller and sensors to your computer.
 - Tinkercad is an online platform that allows you to design and simulate circuits. You can sign up for Tinkercad from the official website: https://www.tinkercad.com/.
   Follow the instructions provided by Tinkercad to connect your microcontroller and sensors to your computer.

**Requirements:**
  1. The intelligent transportation system requires a microcontroller with sensors and actuators to be connected to your computer.
  2. You will need to have a basic understanding of the C++ programming language to use API and libraries.
  3. The Intelligent Transportation System is designed to run on every operating system and on Android applications.

## Usage
- **To user the Intelligent Transportation System, you will need to follow these steps:**
  1. Connect the microcontroller and sensors to your computer according to the instructions provided by Tinkercad.
  2. Open the Arduino IDE and load the project file either ATLS or ADAS, depending on which feature you want to use.
  3. Compile and upload the code to the microcontroller
  4. Run Mosquitto message broker on your computer to facilitate communication between devices.
  5. Open Android Studio project for the Intelligent Transportation System.
  6. Build and run the Android application on your device.
  7. Use the app to control and monitor the features of the Intelligent Transportation System.
  
- **For ATLS, the system will automatically adjust the timing of the traffic lights based on traffic congestion detected by the sensors.** 
- **For ADAS, the system will use distance seeing technology to detect surrounding vehicles or objects and provide early warnings to drivers of potential collisions.**


## Support
- **If you need help with the project, you can find support in the following ways:**
 1. Chat room: You can join the chat room on Discord to ask questions and discuss the project with the following developers:
   https://discord.gg/KN5YJ7TU
 2. Slack : If you prefer to communicate via Slack , you can send a message to the TA or teacher.



## Roadmap
- **As of now we focus on releasing and improving the Intelligent Transportation project but the developers have come up with future releases and features. We welcome feedback and suggestions from the community, and we will continue to work towards improving and expanding the functionality of the Intelligent Transportation system. Here is the following list:**
 1. Integration with more sensor types: Currently, the project relies on a limited set of sensors to gather information about the environment. In future releases, we plan to expand the range of sensors that can be used, such as adding cameras or lidar sensors.
 2. Improved machine learning algorithms: The project currently uses machine learning algorithms to analyze traffic data and make predictions about traffic patterns. In future releases, we plan to refine these algorithms and integrate more advanced techniques to improve accuracy and efficiency. 
 3. Integration with smart city infrastructure: To fully realize the potential of intelligent transportation, it is important to integrate the project with other smart city infrastructure, such as traffic cameras, traffic management systems, and public transportation systems. In future releases, we plan to work towards this goal and enable seamless integration with these systems.
 4. Expansion of ADAS features: The Advanced Driving Assistance System (ADAS) currently includes basic distance sensing technology. In future releases, we plan to expand the range of features to include other safety features, such as lane departure warnings and automatic emergency braking.


## Contributing
- Start with forking the repository and create a new branch for the changes you want to make. You need to have a GitHub account and then press the  "Fork" button in the top-right corner which will create a copy of the project.
- Ensure the code does not break the project's guideline, after you make the changes
- Make the changes and keep on testing the project. We recommend creating a new branch to separate the project code and your changes.
- Add comments and documentation if you needed to classify the changes
- Make a pull request to the projects main repository for the developers review.


## Authors and acknowledgment
- Yingchao Ji         gusjiyid@student.gu.se
- Hassan Saleh        gussalhaf@student.gu.se
- Jessie Johnsson     gusjohjefh@student.gu.se
- Tehreen Asif        gusasite@student.gu.se
- Elif Sayeed Yaqoud  gussayel@student.gu.se



## License
This system is complex when it comes to the traffic lights and the driving assistance system, by making minor changes, it could affect the outcome of the whole idea. As of now, there is no license to this project.
## Project status
The project is continuous and it is in development. All developers are working efficiently and constantly to improve and release the system. 