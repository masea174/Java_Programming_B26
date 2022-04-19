package day26_nested_loops;

public class PrimeInRange {
    /*
    Prime in range

Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

     */
    public static void main(String[] args) {
        int a = 50;
        String prime = "";
        for (int i = 1; i < a; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }}
                if (count < 3) {
                    prime += i + " ";
            }
        }
        System.out.println(prime);
    }}

