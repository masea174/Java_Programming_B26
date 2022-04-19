package day33_methods;

public class MyMathClass {
    public static void add(double num1,double num2){
        System.out.println(num1 + " + "+num2 +" = "+(num1+num2));
    }
    public static void substract(double num1,double num2){
        System.out.println(num1 + " - "+num2 +" = "+(num1-num2));
    }
    public static void multiply(double num1,double num2){
        System.out.println(num1 + " x "+num2 +" = "+(num1*num2));
    }
    public static void divide(double num1,double num2){
        if(num2!=0){
        System.out.println(num1 + " : "+num2 +" = "+(num1/num2));
    }else System.err.println("Cannot devide by 0");}

    public static void main(String[] args) {
        add(3.3,6.7);
        add(4,6);
        substract(8,5);
        divide(10,2);
        multiply(14.3,2);
        divide(9,0);
    }
}
