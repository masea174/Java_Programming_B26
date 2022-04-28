package day52_inheritance.homework.Streeming;

public class Entertaiment {
    /*
    Inheritance – Bigger Task

 create a class Entertainment

  instance variables:
   - name (String) [type of entertainment]
   - company (String)
 */String name;
 String company;

    public Entertaiment(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Entertaiment{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
/*
  constructor:
   - initialize both variables

 create a class Streaming
  -> Streaming is a child of Entertainment

  instance variables:
   - duration (double)

  constructor:
   - initialize name, company, and duration
    -> call super constructor
    -> hint: name value will be 'Streaming' for all subclasses

 create a class Netflix
  -> Netflix is a child of Streaming

  instance variables:
   - show name (String)
   - episode number (int)
   - season number (int)

  constructor:
   - initialize name, company, duration, show name, episode number, and
season number
   -> call super constructor

 create a class Youtube
  -> Youtube is a child of Streaming

  instance variables:
   - video name (String)
   - channel name (String)
   - view count (int)
   - comments (ArrayList of Strings)
Unit 5 - Problem Set


  constructor:
   - initialize name, company, duration, video name, channel name, view
count, and comments
   -> call super constructor

 create a class LiveShow
  -> LiveShow is a child of Entertainment

  instance variables:
   - location (String)

  constructor:
   - initialize name, company, and location
    -> call super constructor
    -> hint: name value will be 'Live Show' for all subclasses

 create a class KevinHart
  -> KevinHart is a child of LiveShow

   instance variables:
    - performer (String)
    - date (String format Ex: mm/dd/yyyy)

   constructor:
    - initialize name, company and location, performer, date
     -> call super constructor
     -> hint: name value will be 'Live Show' for all subclasses

create an object of KevinHart to use the constructors, read the value of each variable to
check if everything is working as expected

List the is a relation of all the classes


Can you answer these:

 What is the purpose of this keyword?

 What is the purpose of super keyword?

 Why do we use constructor chaining?


     */
}
