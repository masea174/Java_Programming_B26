package day21_loops;

public class Fractorial {

    public static void main(String[] args) {
        int a=6;
        int fractorial=1;
        while (a>1){
            System.out.println(fractorial+" * "+a);
            fractorial *= a--;
        }
        System.out.println(fractorial);
    }
}
