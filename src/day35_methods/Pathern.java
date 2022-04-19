package day35_methods;

public class Pathern {
    public static boolean has271(int[] nums) {
        boolean isPattern = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i + 1] == 7 && (nums[i + 2] == 1 || nums[i + 2] == 2)) {
                isPattern = true;
            }
            if (nums[i+1]!=7&&nums[i + 1] - nums[i] == 5 && (Math.abs(nums[i] - nums[i + 2]) <= 2)) {
                isPattern = true;
            }
        }
        return isPattern;
    }

    public static void main(String[] args) {
        int [] arr={2,7,4};
        System.out.println(has271(arr));
    }
}
