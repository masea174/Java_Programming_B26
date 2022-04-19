package day21_loops;

public class LoopedFizBuz {
    /*
    write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
	1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
	2.  For numbers which are divisible by 5, print "Buzz" instead of the number
	3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number


     */
    public static void main(String[] args) {
        int a=1;
        while (a<=50){
            System.out.print(a);
            if (a%3==0&& a%5==0){
                System.out.print(" FizzBuzz");
            }else if(a%3==0){
                System.out.print(" Fizz");
            }else if(a%5==0){
                System.out.print(" Buzz");
            }a++;
            System.out.println();
        }
    }
}
