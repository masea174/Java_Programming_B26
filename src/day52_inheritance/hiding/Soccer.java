package day52_inheritance.hiding;


public class Soccer extends Sports {


    public static void cheer(){
        System.out.println("Cheering from the child class");
    }
}
// it looks like we are overriding , but we are not , because here we a hiding the cheer() from the parrent class