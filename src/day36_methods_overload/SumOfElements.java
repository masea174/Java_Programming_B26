package day36_methods_overload;

public class SumOfElements {
//    public static int sum(int[]nums){
//        int sum =0;
//        for (int each:nums){
//            sum+=each;
//        }return sum;

    public static int sum(int ...nums){
        int sum =0;
        for (int each:nums){
            sum+=each;
        }return sum;
    }

    public static void main(String[] args) {
        int []arr={1,5,6,2};
        System.out.println(sum(arr));
        System.out.println(sum(2,3,4,9,6787,878,79));
    }
}
