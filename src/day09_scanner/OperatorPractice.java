package day09_scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        int w=78/2*2+3-5%5;
        /*     39*2+3-0
                78+3
                81
         */
        System.out.println(w);

        int x = 2 + 3 * 2 / 1;
        /*      2+6/1=8

         */
        System.out.println("x = "+x);
        int a=8;
        int b=a--;//b=8 but a is postdicrement changing to 7
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int L=50;
        int P=--L+L++ + L-- +L++;
        //
        
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //      -101*-101/100+100=202
        System.out.println("t = " + t);
        System.out.println("p = " + p);



        int c =1;//=>0=>1=>0=>-1
        int d = -c-- + c++ / -c-- * --c;
        //     -1      0/1*-1=-1
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int A = 50;//50
        int B = --A + A++ + A-- + A++;
        //        49+ 49+   50+   49=197
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int R = 20;//18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20 +  -19     19 *19%2
        //          -39   + 361%2 
        //          -39 +1=-38
        System.out.println("R = " + R);
        System.out.println("W = " + W);

        int M = 300;//400
        int N = 400;//400
        int U = ++M + N++ - M-- % 2 + --N % 2;
        //      301 +400-   301%2 +   400%2
        //       701-1+0=700
        System.out.println("M = " + M);
        System.out.println("N = " + N);
        System.out.println("U = " + U);

        int e=1;//=>0 =>1=>0=>-1
        int f=-e-- +e++ /-e-- *--e ;
        //      -1+0    /-1  * -1
         //      -1 +   0* -1
        //         -1+0=-1
        System.out.println("e = " + e);
        System.out.println("f = " + f);


    }
}
