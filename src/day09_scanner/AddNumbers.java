package day09_scanner;
import java.util.Arrays;
import java.util.Scanner;
public class AddNumbers {
    //create scanner object
//    ask the user to enter 3 numbers
//    find and print the sum of the numbers
//
//
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {// outer loop  i=0
//            for (int j = 0; j < 10; j++) {//inner loop
//                System.out.println(i + " " + j); // 0 0
//                //0 1
//                //0 2
//            }
//            System.out.println();
 int [] arr={10,3,4,5,6};
 //          0,1,2,3,4
 int a=10;
 int i=0;
 int []arr3=new int[3];
 boolean [] arr2 =new boolean[4];
 String []arr4=new String[4];
 double []arr5=new double[4];
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr5));
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("plese enter 3 numbers \n1: ");
//        int number1=input.nextInt();
//        System.out.println("this is number1 : "+number1);
//        System.out.println(2);
//        int number2=input.nextInt();
//        System.out.println("this is number 2: "+number2);
//        int number3=input.nextInt();
//        System.out.println("3: "+number3);
//
//        System.out.println("sum of your numbers is :"+(number1+number2+number3));
//
//        int a=8,b=2;
//        a+=b;a=a+b;
//        a-=b;a=a-b;
//        int sum= 0;
//        sum+=b;sum=sum+b;

        String name="Diananannana";
         //          01234
        int index=name.indexOf("a",3);
        System.out.println(index);
         int index2=name.indexOf("a",5);
        System.out.println(index2);
        System.out.println(name=name.replaceFirst("a","O"));
        System.out.println(name.replaceFirst("a","O"));;
 while (i<arr.length){
     System.out.println(arr[i++]);
 }
    }


}
