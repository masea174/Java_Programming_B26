package day08_relational_operations;

public class UpdateVariable {
    public static void main(String[] args) {

        //ading 1 to a variable
        int a=10;
        a=11;
        a++;
        ++a;
        a=a+1;


        //add 10 to a variable
        int b=4;
        // 10 times i write b++
        b=14;
        b=b+10;//reads the value of b ads10 to it and restore back to b and reassign
        b+=10 ;//this code is the same as b=b+10

        int count =0;
        count +=5;//count=count+5
        System.out.println(count);

        count-=10;//count=count-10
        System.out.println(count);

        count*=2;
        System.out.println(count);

    }
}
