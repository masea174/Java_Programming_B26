package day21_loops;

public class WhileLoopPractice {
    /*
    While Loop Practice

write a program that will print all the alphabet letters in lowercase from 'a' to 'z'

write a program that will print all the alphabet letters in uppercase from 'A' to 'Z'

write a program that will print all the alphabet letters backwards in lowercase from 'z' to 'a'

write a program that will print all the alphabet letters backwards in uppercase from 'Z' to 'A'

     */
    public static void main(String[] args) {
        char letter='a';

        while (letter<='z'){
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println();
        char letter2='A';

        while (letter2<='Z'){
            System.out.print(letter2+" ");
            letter2++;
        }
        System.out.println();
        char letter3='z';
        while( letter3>='a'){
            System.out.print(letter3+" ");
            letter3--;
        }
        System.out.println();
        char letter4= 'Z';
        while( letter4>='A') {
            System.out.print(letter4 + " ");
            letter4--;

        }System.out.println();
            int a=1;
            int sum=0;
            while (a<=500){
                System.out.println(sum+" + "+a);
               sum+= a++;
            }
        System.out.println("================================");
        int letter9 =122;
        while(letter9>=97){
            System.out.print((char)letter9);
            letter9--;
        }

    }}

