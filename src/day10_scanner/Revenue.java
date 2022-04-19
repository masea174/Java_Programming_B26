package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner imput= new Scanner(System.in);
        System.out.println("please enter the price of the product :");
        //double price= imput.nextDouble();
        System.out.println("enter the quantity");
        //int quant=imput.nextInt();
        //System.out.println("the revenue is :  $"+(price*quant));
        System.out.println("the revenue is :  $"+(imput.nextDouble()* imput.nextInt()));

}}
