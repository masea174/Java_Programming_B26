package day23_loops;

public class Syllabes {/*Given a String separated by dashes calculate how many syllables the words are
    Ex:
    Input:
    ja-va Output:
            */

    public static void main(String[] args) {
        String mess="ma-ma";
        int num=1;
        for (int index=0;index<mess.length();index++){
            if(mess.charAt(index)=='-'){
                num+=1;

            }
        }
        System.out.println(mess+ " contains "+num+" syllabes.");
    }
}
