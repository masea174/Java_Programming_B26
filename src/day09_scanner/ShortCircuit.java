package day09_scanner;

public class ShortCircuit {
        public static void main(String[] args) {

            //System.out.println(5/0);
            System.out.println(true || 5/0==0);//5/0 its not executed becouse it takes only the first part that is
            //true and somthing else will be true
           // System.out.println(true |5/0==0);error
            System.out.println(false&& 5/0==0);//the right side will never be run
            //System.out.println(false & 5/0==0);//the right side will run and give error -SHORT CIRCUIT

            int a=0;

            System.out.println(false && a++==5);
            System.out.println(a);
            int b=0;

            System.out.println(false& b++ ==5);//b will change becouse one and is only pressent so the incremation has to be executet
            System.out.println(b);
        }

}
