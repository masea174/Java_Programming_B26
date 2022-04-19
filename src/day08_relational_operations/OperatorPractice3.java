package day08_relational_operations;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h=5;
        int p=h;// p gets assigned the value of h
        //in memory p is 5

        h++;//post increment but there is no other code so adds 1
        System.out.println("h="+h);
        System.out.println("p="+p);

        int k=h++;//k will take the current value of h that is 6 ,and increment h to 7
        System.out.println("h=" +h);
        System.out.println("k="+k);

        int g=++h;

        System.out.println("g="+g);
        System.out.println("h="+h);

    }
}
