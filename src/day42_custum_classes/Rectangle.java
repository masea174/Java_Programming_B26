package day42_custum_classes;

public class Rectangle {
    int base;
    int height;
    int perimetr;
    int area;

    @Override
    public String toString() {
        return "Rectangle " +
                "base=" + base +
                ", height=" + height +
                ", perimetr=" + perimetr +
                ", area=" + area
                ;
    }
    public void calculatePerimetr(int base,int height){
        perimetr =2*(base+height);
        System.out.println("perimetr is "+perimetr);
    }
    public void calculateArea(int base , int height){
        area=base*height;
        System.out.println(area+" is the area");
    }
}
