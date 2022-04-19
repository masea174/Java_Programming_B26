package day28_arrays;

public class MaxMin {
    /*
    declare and asign an array find the biggest and the smallest
    
     */
    public static void main(String[] args) {
        int[] num={500,120,-80,90,250,-10};
        int biggest=num[0];
        int smallest=num[0];
        for (int i = 0; i < num.length; i++) {
            if(biggest<num[i]){
                biggest=num[i];
            }if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("biggest = " + biggest);;
        System.out.println("smallest = " + smallest);
        
    }
}
