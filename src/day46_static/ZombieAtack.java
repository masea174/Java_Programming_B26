package day46_static;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAtack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {0, 7, 0, 24, 13, 0, 15, 7};
        int[] copyinhabitants = Arrays.copyOf(inhabitants, inhabitants.length);
        int sum = 0;
        int day = 0;

        //TODO. Write your code below this line.
        do {
            sum = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (copyinhabitants[i] == inhabitants[i]) {
                    if (inhabitants[i] == 0 && i == 0) {

                        inhabitants[i + 1] /= 2;
                    } else if (inhabitants[i] == 0 && i == inhabitants.length - 1) {
                        inhabitants[i - 1] /= 2;
                    } else if (inhabitants[i] == 0 && i < inhabitants.length - 1) {
                        if (inhabitants[i + 1] == copyinhabitants[i + 1]) {
                            inhabitants[i + 1] /= 2;
                        }
                        if (inhabitants[i - 1] == copyinhabitants[i - 1]) {
                            inhabitants[i - 1] /= 2;
                        }

                    }
                }
                sum += inhabitants[i];
            }
            copyinhabitants = Arrays.copyOf(inhabitants, inhabitants.length);
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        } while (sum != 0);


    }
}

