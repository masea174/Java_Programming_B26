package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface <String> printEachChar=(s)->{
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEachChar.test("Hello World");
        System.out.println();
        DynamicInterface <Integer> printEveryNumber=(n)->{
            for (int i = 0; i < 5; i++) {
                System.out.println(n);
            }
        };
        printEveryNumber.test(29);
    }
}
