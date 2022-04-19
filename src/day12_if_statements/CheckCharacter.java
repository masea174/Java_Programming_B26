package day12_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {
        char letter='A';
        if (letter >64 && letter<90){
            System.out.println("The letter is uppercase ");
        }
        if (letter>=97&&letter<=122){
            System.out.println("The letter is lowercase");
        }
    }
}
