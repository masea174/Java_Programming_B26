package day17_string_introduction;

import javax.lang.model.element.NestingKind;

public class StringMemory {
    public static void main(String[] args) {

        String first="java";//String literal
        String second=new String("Java");
        System.out.println(first==second);// it gives you false because the compare operator doesnt compare the caracters but compares the memory location of the object
        String third ="java";
        System.out.println(first==third);//its becose they are the same object
        String fourth="Java";
        System.out.println(first==fourth);//2 dif objects in the string pool
        String fifth="java";
        System.out.println(second==fifth);//2 dif objects

}}
