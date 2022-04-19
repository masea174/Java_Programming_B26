package day47_encapsulation;

public class Square {
    /*
    create a class called Square

        - data:

            side

        - constructor

            - create a constructor that creates a Square object with the side

            	call setter here

        - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

     */
    private int side;

    public Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public static int calculateArea(int side) {
        int area = side * side;
        return area;
    }

    public static int calculatePerimetr(int side) {
        int perimetr = 2 * (side + side);
        return perimetr;
    }


    public String toString() {
        return "Square side=" + side +
                "\nperimetr= " + calculatePerimetr(getSide()) +
                "\narea= " + calculateArea(getSide());
    }
}