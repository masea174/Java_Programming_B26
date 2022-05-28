package day63_functional_interface;

public class UsingNumbersInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd=(n)->  {
            if(n%2==0){
                System.out.println(n +" is even");
            }else {
                System.out.println(n+" is odd");
            }
        };
        evenOrOdd.apply(98);

        NumberInterface cube=(n)->{
            System.out.println(n*n*n);
        };
           cube.apply(8);
           cube.apply(3);
           cube.apply(10);
        }
    }

