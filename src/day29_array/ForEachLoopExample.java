package day29_array;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[]nums={30,12,159,15};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("traditional loop "+ nums[i]);
        }
        System.out.println();
        for( int each: nums){
            System.out.println("for each:" +each);
        }

        //STRING EXAMPLE:
        String []classes={"java","selenium","Soft skills","database","api"};
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
        System.out.println("-----for each ------------");
        for(String elements:classes){
            System.out.println("each "+elements);
        }
        double [] prices={10.4,40.2,410.2};
        for( double price:prices){
            System.out.println("$ "+price);
        }



    }
}
