package day50_inheritance.computer;

import java.util.ArrayList;
import java.util.Arrays;

public class Sport {
    Water water;

    public Sport(String color) {
        water = new Water(color);
    }
}
    class Water {
        String color;
        public Water(String color) {
            this.color
                    =
                    color;}

        public static void main(String[] args) {
            float[] a = new float[8];
            System.out.println(Arrays.toString(a));
        }}
