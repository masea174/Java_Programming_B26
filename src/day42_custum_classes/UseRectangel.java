package day42_custum_classes;

public class UseRectangel {
    public static void main(String[] args) {
        Rectangle square1=new Rectangle();
        square1.base=4;
        square1.height=8;
        square1.calculateArea(square1.base, square1.height);
        square1.calculatePerimetr(square1.base, square1.height);
        System.out.println(square1);
    }
}
