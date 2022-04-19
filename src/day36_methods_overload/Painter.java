package day36_methods_overload;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("red","blue");
        String s="100";
        Picture.draw(s);
    }
}
