# MAD_Assignment1
Question : Design a GUI for an application demonstrating  activity to activity communication with event handling technique.

<br />__Solution :__

<br />Designing a GUI for an application in Flutter that demonstrates activity-to-activity communication with event handling 
involves creating multiple screens and defining how data is passed between them.

<br />In this example:

<br />1.We have two screens, Screen1 and Screen2, each represented by a "StatefulWidget".

<br />2.Screen1 contains a button to open Screen2 and displays data received from Screen2.

<br />3.Screen2 has a text input field for the user to enter data and a button to send that data back to Screen1.

<br />4.When the "Send Data to Screen 1" button is pressed in Screen2, it uses Navigator.pop to send the data back to Screen1.

<br />5.Screen1 receives the data and updates the display.

<br />6.This demonstrates a basic activity-to-activity communication pattern in Flutter using event handling.




