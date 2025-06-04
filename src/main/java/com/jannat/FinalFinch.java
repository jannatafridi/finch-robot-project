package com.jannat;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

       //this allows the robot to draw the full circle
       myFinch.setMotors(50, 0);

       // as  the robot draws the circle, it prints the message "IM HUNGRY"
     myFinch.print("IM HUNGRY");
     myFinch.pause(6);

     //this stops the robot from drawing the circle and pauses
       myFinch.setMotors(0, 0);
     myFinch.pause(5);

// during the pause, i lift up the robot to create he two lines for the "eyes"
 myFinch.setMove("F", 3, 20);
     myFinch.pause(5);

  myFinch.setMove("F", 3, 20);
     myFinch.pause(5);

// then i pick up again and the code runs to draw the smile
myFinch.setMotors(10, 0);
     myFinch.pause(2);

// fully stops program
        myFinch.stopAll();
        myFinch.disconnect();
    }
}