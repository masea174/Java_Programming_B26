package day07_unary_operation;

public class ParkingLot {
    public static void main(String[] args) {

        int cars=10;
        System.out.println("2 cars drove into the parking lot");

        cars=cars+2;
        System.out.println( "cars now parked= "+cars);

        System.out.println(" 2 more cars are comming into the parking lot");
        cars=++cars;
        cars=++cars;
        System.out.println(cars);

        System.out.println("5 cars left the lot");
        cars=cars-5;
        System.out.println("Cars left on the property = "+cars);

    }
}
