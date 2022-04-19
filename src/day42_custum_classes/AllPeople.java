package day42_custum_classes;

public class AllPeople {
    public static void main(String[] args) {

      //  This is not a
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.heigth);
////        System.out.println(isMarried);

        Person person1=new Person(); // creates an object of the person class
        Person person2=new Person();

        //access intance variable
        person1.name="james";
        person1.age=40;
        person1.heigth=6.2;
        person1.isMarried=false;


        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.heigth);
        System.out.println(person1.isMarried);
        System.out.println();
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.heigth);
        System.out.println(person2.isMarried);
    }
}
