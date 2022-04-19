package day28_arrays;

public class AverageNumber {
    /*
    Average Number from Array
Given an int array calculate the average number -> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
     */
    public static void main(String[] args) {
        int [] num= {1,3,4,5,9};
        int sum= 0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        } double aver=sum/num.length;
        System.out.println(aver);
    }
}
