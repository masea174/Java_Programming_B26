package day_33_methods;

public class FirstMethod {
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    public static void helloWorld50(){
        for (int i = 0; i < 50; i++) {

        System.out.println("hello world");
    }}

    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        System.out.println();
        helloWorld50();
    }
}
