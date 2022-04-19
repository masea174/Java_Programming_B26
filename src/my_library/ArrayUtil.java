package my_library;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNUmber(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    /*
    Max Number

create a method that will accept an int array and return the biggest number fro
     */
    public static int maxNumber(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    /*
    Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */
    public static boolean containsNumber(int[] a, int b) {
        boolean containsN = false;
        for (int each : a) {
            if (each == b) {
                containsN = true;
            }
        }
        return containsN;

    }

    /*
    Add Element

create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array

--------------------------------------------------

     */
    public static int[] addElement(int[] a, int b) {
        int[] c = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        c[c.length - 1] = b;
        return c;

    }//  find a index in array for elements

    public static int indexOf(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] a, String element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(element)) {
                return i;
            }
        }
        return -1;

    }

    public static int[] addElement(int[] origina, int[] elenentToAdd) {
        int[] newArray = new int[origina.length + elenentToAdd.length];
        for (int i = 0, j = 0; i < origina.length; i++) {
            newArray[i] = origina[i];
        }
        for (int i = origina.length, j = 0; i < newArray.length; i++) {
            newArray[i] = elenentToAdd[j++];
        }
//         //USING ONLY ONE LOOP WITH A IF CONDITIN

//
//        for (int i = 0, j = 0; i < newArray.length; i++) {
//            if (i < origina.length) {
//                newArray[i] = origina[i];
//            } else {
//                newArray[i] = elenentToAdd[j++];
//            }
//
//        }
        return newArray;
    }
    public static String[] addElement(String[] origina, String elenentToAdd) {
        String[] newArray = new String[origina.length + 1];
        for (int i = 0; i < origina.length; i++) {
            newArray[i] = origina[i];
        }
        newArray[newArray.length - 1] = elenentToAdd;
        return newArray;
    }
    public static ArrayList<Integer> getIntegers(int n) {
        ArrayList<Integer> number = new ArrayList<>();
        while (n > 0) {
            number.add(0, n % 10);
            n /= 10;
        }
        return number;
    }
}