package day43_constroctors;

public class ThisKeyword {
    int a=100;

    public ThisKeyword(int a){
        a=400;// this is hardcode it doesnt matter what was givven as an argument
        System.out.println(a);
        this .a=600;
    }
}
