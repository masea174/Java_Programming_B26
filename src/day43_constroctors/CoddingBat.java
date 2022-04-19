package day43_constroctors;

import java.util.ArrayList;

public class CoddingBat {
    public static  boolean linearIn(int[] outer, int[] inner) {
        ArrayList<Integer> outList=new ArrayList<>();
        ArrayList <Integer> inList=new ArrayList<>();
        for (int i = 0; i < outer.length; i++) {
            outList.add(outer[i]);
        }
        for (int i = 0; i < inner.length; i++) {
            inList.add(inner[i]);
        }
        outList.removeAll(inList);
        return (outer.length-inner.length)==outList.size();
    }

    public static void main(String[] args) {
        int []a={1, 2, 4,4, 6};
        int []b={2, 4};
        System.out.println(linearIn(a,b));
    }
}
