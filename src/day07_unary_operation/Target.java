package day07_unary_operation;

public class Target {
    public static void main(String[] args) {

        String Store=("Target");
        int numberOfTVs=100;

        System.out.println("Person comes into the store and bought a TV");
        System.out.println("Number of TVs now: "+ --numberOfTVs);

        System.out.println("Person comes into the store and bought a TV");
        System.out.println("Number of TVs now: "+ --numberOfTVs);

        System.out.println("Person comes into the store and put a TV into they cart");
        System.out.println("Number of TVs in store now: "+ numberOfTVs--);

        System.out.println("Person checked out the tv , tv left : "+numberOfTVs);

        System.out.println("I get a shippment ");
        numberOfTVs=numberOfTVs+13;
        System.out.println("number of TV in stock : "+numberOfTVs);






    }

}
