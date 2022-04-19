package day31_array_class;

import java.util.Arrays;

public class MultiplyArrays {
    /*
    Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation

Ex:

	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}

		x

	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}

Output:

	{10, 6, 9}
	{10, 10, 70}
	{0, 60, 100}

----------------------------
     */
    public static void main(String[] args) {
        int[][] a={
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20}
        };
        int [][]b={
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };
        int[][] c=new int[3][3];

        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            c[i][j]=a[i][j]*b[i][j];

        }
        }
        System.out.println(Arrays.deepToString(c));


    }
}
