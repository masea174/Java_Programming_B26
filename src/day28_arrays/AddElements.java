package day28_arrays;

public class AddElements {
    /*
    declare and assign in array of number 
    sum all numbers
     */
    public static void main(String[] args) {
        int[]numbers={3,6,10,87};
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
        
    }
}
