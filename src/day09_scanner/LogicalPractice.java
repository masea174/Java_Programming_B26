package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {
        // 5 <num <10
        int n=20;

        System.out.println(n>5);
        System.out.println(n<10);

        System.out.println(n>5 && n<10);

        System.out.println(4>3 || false);
        System.out.println( 3>4 ||false);
        System.out.println( 3>4 ||true);
        System.out.println( 4>3 ||true);
        // what if I want a number outside of range

        System.out.println(n<5 || n>10);

        System.out.println(!false );//true
        System.out.println(!true);//false
    }
}
