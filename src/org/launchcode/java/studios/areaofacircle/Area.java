package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
 public static void main(String[] args){
     Area area = new Area();
     area.calculateArea();
 }

    public Area(){


    }

    public void calculateArea(){

        Scanner input  = new Scanner(System.in);
 try {

     Double myUsersRadius = input.nextDouble();


     if (myUsersRadius < 0) {
         System.out.println("No negative number");

     } else {

         Double Area = Circle.getArea(myUsersRadius);
         System.out.println(Area);
     }
 }catch(Exception error){
System.out.println("Numeric input only");
 }
        input.close();
    }
}
