package day29_array;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int even = 0;
        String evenNums = "";
        int odd = 0;
        String oddNums = "";
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
                evenNums += num + " ";
            } else {
                odd++;
                oddNums += num + " ";
            }
        }
        System.out.println("odd " + oddNums + "= " + odd);
        System.out.println("even " + evenNums + "= " + even);
    }
}
