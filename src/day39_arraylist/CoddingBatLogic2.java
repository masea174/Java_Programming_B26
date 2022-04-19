package day39_arraylist;

public class CoddingBatLogic2 {
    public static void main(String[] args) {
        System.out.println(closeFar(4,1,3));
    }
    public static boolean closeFar(int a, int b, int c) {
        return(Math.abs(a-b)==1&&(Math.abs(c-a)>=2&&Math.abs(c-b)>=2)||Math.abs(a-c)==1&&(Math.abs(c-a)>=2 || Math.abs(c-b)>=2));




    }}
