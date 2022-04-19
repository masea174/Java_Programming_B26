package day07_unary_operation;

public class UnaryPractice {
    public static void main(String[] args) {
        int b = 10;
        b++;//10
        System.out.println(b);//11
        b--;//11
        System.out.println(b);//10
        System.out.println(b++);//10
        System.out.println(b++);//11
        System.out.println(
        );
        int a = 40;
        System.out.println(--a);//39
        System.out.println(--a);//38
        System.out.println(a--);//38
        System.out.println(--a);//36
        System.out.println(--a);//35
        System.out.println(a--);//35
        System.out.println();

        int c = 14;
        c--;//14
        c++;//13
        --c;//13
        c--;//13
        c++;//13
        System.out.println(c);

        System.out.println("A"+0+1);
        System.out.println("B"+(1)+(2));

        int i=100;
        double d=123;
        float f=300;
        i=(int)f;
        f=i;
        d=i;f=(float)d;


    }
}
