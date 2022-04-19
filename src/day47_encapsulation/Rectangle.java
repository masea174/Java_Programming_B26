package day47_encapsulation;

public class Rectangle {
    /*

    create a class called Rectangle

        - data:

            length, width

        - constructor

            - create a constructor that creates a Rectangle object with the length and the width

            	call setters here

        - encapsulate the Rectangle class

        	- setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects
     */
    private int  length ;
    private int width;

    public Rectangle(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
       if(length>0)
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0){
        this.width = width;
    }}
    public static int calculateArea(int width ,int length){
        return width*length;
    }
    public static int calcutatePerimetr(int width,int length){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle " + "length=" + length + ", width=" + width +
                "\n\t area="+calculateArea(getWidth(),getLength())+
                "\n\t perimetr= "+calcutatePerimetr(getWidth(),getLength());
    }
}
