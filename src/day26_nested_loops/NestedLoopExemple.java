package day26_nested_loops;

public class NestedLoopExemple {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("hello Universe\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("hello Universe");

        System.out.println("=========================================");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }
            System.out.println("hello Univers\n");
        }

    }
}

