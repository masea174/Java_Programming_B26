package day32_multiverse_arrays;

import java.util.Arrays;

public class AverageOfEachTraditional {    /*
    a 2d array the goal is we need to print the average of every array
    a average for the whole array
     */
    public static void main(String[] args) {
        int[][] a={
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };
        double average=0;
        double generalAver=0;
        int totalLength=0;
        for(int i=0;i<a.length;i++){
            double sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                totalLength++;

            }
            System.out.println(Arrays.toString(a[i]));
            System.out.println("average ="+(average=sum/a[i].length));
            generalAver+=sum;

        }
        System.out.println(generalAver/totalLength+" array average");
    }
}


