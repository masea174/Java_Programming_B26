package day07_unary_operation;

public class Letters {
    public static void main(String[] args) {
        //define a character .print the next 4 characters on a new line

        char letter ='G';

        System.out.println( "This is my original letter : "+letter);
        System.out.println(" This is my second letter : "+ ++letter);
        System.out.println("My third letter: "+ ++letter);
        System.out.println("My forth: "+ ++letter);
        System.out.println("My last : "+ ++letter );

        letter='G';
        System.out.println("This is my original letter: "+letter++);
        System.out.println("and this ones are next four:" );
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        boolean x=true;
        boolean z=true;
        int y=20;
        x=y!=10||(z=false);
        System.out.println(x);

    }
}
