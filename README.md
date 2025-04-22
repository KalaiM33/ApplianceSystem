# ApplianceSystem
This is a Spring boot Java Application which takes form input to the controller and the controller redirects to View as per the requirement.

The system should be able to control various home appliances such as a Light, Fan, and Air Conditioner. Each appliance has its own unique way of being turned on and off.
1. Light: The light can be turned off by toggling a switch to the "off" position.
2. Fan: The fan can be turned off by reducing its speed to zero. 0 = off, 1, and 2.
3. Air Conditioner: The air conditioner can be turned off by setting the thermostat to the "off" mode.
The system will also be updated once a year automatically on January 1st 1:00am local time. The system will turn off all devices for the update. No other actions.

Include  Unit Test cases as well in the deliverable.

One can Clone this repository to their local machine and once the application is up and running
Access it through http://localhost:8080/index.html

Test Cases:
1. HomeApplianceControllerTest.java
2. YearlyShutDownSchedulerTest.java

Note: Included option to add a device from homePage.


![ApplianceHome](https://github.com/user-attachments/assets/2efabbbf-09d3-4bac-a2ea-b4a4076e235a)
