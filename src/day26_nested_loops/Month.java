package day26_nested_loops;

public class Month {
    public static void main(String[] args) {
        /*
        go thru a whole month by going thru each week and each day

         */
        for (int week =1;week<5;week++){
            System.out.println("Week: "+week);
            for (int day = 1; day <8 ; day++) {
                System.out.println("\t day:"+day);
            }
        }
    }
}
