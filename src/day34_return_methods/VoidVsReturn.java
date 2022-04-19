package day34_return_methods;

public class VoidVsReturn {
    public static void sayHello() {
        System.out.println("Hello");
    }
    public static String everyNth(String str, int n) {
        String ret=str.charAt(0)+"";
        int i=n;
        while(i<str.length()){
            ret+=str.charAt(n);
            i+=n;
        }return ret;
    }


    public static void main(String[] args) {
        sayHello();
        String str="ggdhajDGJ";
        //String msg=sayHello(); its not valid because the method doesnt have any return values
        System.out.println(sayBye());
        System.out.println(everyNth("helloooo",2));
    }


    public static String sayBye() {
        return "Bye";

}}