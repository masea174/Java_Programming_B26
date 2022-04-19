package day24_practice;

public class SecondStringReverse {
    /*
    Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java

     */
    public static void main(String[] args) {
        String mess="i wish java";
        String nMess="";
        String word2=mess.substring((mess.indexOf(" ")+1),(mess.lastIndexOf(" ")));
        System.out.println(word2);
        for (int i =0; i <word2.length(); i++) {
            nMess=word2.charAt(i)+nMess;
        }
        System.out.println(mess.replace(word2,nMess));
    }
}
