package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j = 1; j < 11; j++) {
            for (int i = 0; i < 11; i++) {
                System.out.print(j+" x "+i+" = "+j*i+"\t\t");
            }
            System.out.println();
        }
    }
}
