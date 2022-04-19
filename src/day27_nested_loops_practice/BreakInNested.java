package day27_nested_loops_practice;

public class BreakInNested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " i");

            if (i==3){
                break;                                          //the first 3 itererations will be complete , the run will Stop the outer loop after the if statement is true
            }
            for (int j = 0; j < 2; j++) {
                System.out.println(j + " j");
                //break;                                      // the inner break will stop only the iner loop but the outer loop will iterate fully , but inner loop will execute the code just till the break statement.
            }
            System.out.println();
            // break;---this will stop the outer loop after first iteration
        }
    }
}
