package day_33_methods;

public class EvenOddArray {
    /*
    Create a method that accepts an int array. Count how many even and odd
numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd
elements
Ex:
input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
public static void oddEvenArray(int[]a){
    int odd=0;
    int even =0;
    for (int i : a) {
        if(i%2==0){
            even++;
        }else {
            odd++;
        }


    }
}

}