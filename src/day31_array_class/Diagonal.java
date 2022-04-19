package day31_array_class;

public class Diagonal {
    /*
    Given a 2D array with values:

	{3, 5, 1}
	{1, 6, 10}
	{5, 21, 10}


Calculate and find the biggest diagonal

	if an array was

	a b c
	d e f
	g h i

	aei and ceg would be the diagonals

     */
    public static void main(String[] args) {
        int [][] a={
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };
        System.out.println("diagonals are "+a[0][0]+a[1][1]+a[2][2]+" and "+a[2][0]+a[1][1]+a[0][2]);

        }
    }

