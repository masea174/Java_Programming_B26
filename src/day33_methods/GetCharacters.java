package day33_methods;

public class GetCharacters {
    /*
    make a method that prints all the letters from A-Z
    from a-z
    frolm Z-A
    from z-a
    from 0-9
     */
    public static void fromAZUpperCase() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fromZAUpperCase() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fromZtoALowerCase() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fromAZLowerCase() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void from09() {
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fromAZUpperCase();
        fromAZLowerCase();
        fromZtoALowerCase();
        fromZAUpperCase();
        from09();
    }
}

