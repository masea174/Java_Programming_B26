package day29_array;

public class AverageNumbers {
    public static void main(String[] args) {
        int []nums={10,15,5,6};
        int sum=0;
        for( int each :nums){
            sum+=each;
        }
        System.out.println("Average num is "+(sum/ nums.length));
    }
}
