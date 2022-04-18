package day_33_methods;

public class ArraySum {
    /*
    Create a method that accept an int array. Take the sum of all the numbers
and print the result
     */
    public static  void arraySum(int [] a){
        int sum =0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];

        } System.out.println(sum);
    }

    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,7,9};
        arraySum(a);
        arraySum(new int[]{1,2,3,4,5,6});
    }
}
