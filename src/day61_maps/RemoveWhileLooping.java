package day61_maps;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,56,78,87,99754,3,4,2,4,3,2,5));

//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)<5){
//                list.remove(i);
//            }
//            this doent work because the indexed are geting shifted
//        }
        /// for each loop removing is also not vallid because we cant change the size of any collecytion in for each loop it throws an exception,
        Iterator <Integer> it=list.iterator();
        while(it.hasNext()){//still has elements
            if(it.next()<5){// moves to next element and returns the one it was on
                it.remove();
            }
        }

        System.out.println(list);
    }
}
