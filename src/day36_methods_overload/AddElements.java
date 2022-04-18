package day36_methods;

public class AddElements {
    public static int[] addElement(int []origina,int elenentToAdd){
        int []newArray =new int[origina.length+1];
        for (int i = 0; i < origina.length; i++) {
            newArray[i]=origina[i];
        }
        newArray [newArray.length-1]=elenentToAdd;
        return newArray;
    }
}
