package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        int i = 2;

        while (i < 101) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();
        int s = 2;
        if (s % 2 == 0) {
            while (s < 101) {
                System.out.println(s);
                s += 2;
            }
        }
        System.out.println();
        int a = 1;
        while (a <= 100) {
            System.out.print(a+" ");
            a += 2;

        }
        System.out.println();
        int b= 0;
        while (b++<100){
            if(b%2==1)
            System.out.print(b+" ");
        }
    }
}

