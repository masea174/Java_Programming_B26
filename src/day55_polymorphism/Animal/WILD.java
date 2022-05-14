package day55_polymorphism.Animal;

import day49_inheritance.Lion;

import javax.management.MBeanAttributeInfo;

public class WILD {
    public static void main(String[] args) {
        //all possible references /objects of Lizard

        //itself
        Lizard lizard=new Lizard();
        lizard.eat();
        lizard.name="lizard";
        lizard.numberOfClaws=10;
        lizard.skinColor="camo";
        System.out.println(lizard.name);
        System.out.println(lizard.skinColor);
        System.out.println(lizard.numberOfClaws);

        //supper class_Reptile
        Reptile reptile=new Lizard();
        reptile.eat();
        reptile.name="Lizard";
        reptile.numberOfClaws=10;
       // reptile.skinColor="camo";  -reptile reference doesnt have the access to the child information , it is from diferent class , that evolved in the child class

        //super class Animal
        Animal animal=new Lizard();
        animal.eat();
        animal.name="reptile";
        //we cannot use the skin color and the claws number because those are from the child class,we cannot access them in the parent class with direct access we need to cast , how? we will get it latter
// we did 3 references to the object reptile ;
        //when it comes to executions the object implementation will run


    }
}
