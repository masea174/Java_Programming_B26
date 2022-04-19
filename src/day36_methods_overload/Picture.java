package day36_methods_overload;

public class Picture {
    public static void draw(){
        System.out.println("trying to draw");
    }
    public static void draw(String color ){
        System.out.println("draw with "+color);

    }public static void draw(String color,String color2){
        System.out.println("draw with "+color+" and color "+color2);
    }
    public static void draw(int size){
        System.out.println("drawing with size "+size);
    }
//  NOT A VALID PARAMETR YOU HAVE THE SAME PARAMETR CHANGING ONLY THE NAME
//    public static void draw (int length){
//        System.out.println("drawing with length "+length);
//    }
    public static void draw (int size, int length){
        System.out.println("drawing with size "+size +" and length "+length);
    }
    public static void draw(String color, int size){
        System.out.println("color with size");
    }
    public static void draw(int size,String color){
        System.out.println("color with size");
    }
}
