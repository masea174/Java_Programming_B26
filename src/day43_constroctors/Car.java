package day43_constroctors;

public class Car {
    /*
    reate a class Car

create instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */

 String model;
 int year;
 String color;
 int fuelLever;
 public void drive(){
  System.out.println("Driving "+model);
  fuelLever -=5;
 }
 public void fillTank(){
  fuelLever =100;
 }
 public boolean isLow(){
  return fuelLever<26;
 }

 @Override
 public String toString() {
  return "Car " +
          "model=" + model  +
          "\nyear=" + year +
          "\ncolor=" + color  +
          "\nfuelLever=" + fuelLever +"%"+
          "\n"+ (isLow()?"Tank is low":"Keep on driving");
 }
}