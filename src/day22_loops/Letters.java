package day22_loops;

public class Letters {
    public static void main(String[] args) {
        char a='a';

        while(a<='z'){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
            a ='Z';
        while (a>='A'){
            System.out.print(a+" ");
            a--;
        }
    }
}
