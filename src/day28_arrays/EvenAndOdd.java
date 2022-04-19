package day28_arrays;

public class EvenAndOdd {
    /*
    Even and odd from array
Write a program that can count the even and odd number from an array of integers
Ex:
Input: [4,1,3,12,5]
Output: Even: 2
Odd: 3
     */
    public static void main(String[] args) {
        int [] num={2,23,4,5,6,7,78,8};
        int odd=0;
        int even=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
