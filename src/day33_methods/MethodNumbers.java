package day_33_methods;

public class MethodNumbers {
    /*
   create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public static void evenNumbers(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void oddNumbers(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2!=0)
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
    }
}
