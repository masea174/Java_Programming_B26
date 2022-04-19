package day11_if_statements;

public class SingleIFExample {
    public static void main(String[] args) {

        if(false){
            System.out.println("hello world");
        }
        System.out.println("Second line");

        if(true){
            System.out.println("Todays Monday");

        }
        int score=60;
        if (score>=75){
            System.out.println("Passing");
        }
        if (score<75){
            System.out.println("Failing");
        }
        int year=2022;
        boolean lockdown= year == 2020 || year== 2021;
        if (lockdown){
            System.out.println("Stay at home ");
            System.out.println("Practice Java");
            System.out.println("Wear mask");

        }
        if(!lockdown){
            System.out.println("Leave yor life");
            System.out.println("You can Party" );
            System.out.println("Maybe Travel");
        }
































    }
}
