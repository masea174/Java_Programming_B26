package day24_practice;

public class SpaceProgram {/*Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

    Ex: java	-> j a v a
    space 	-> s p a c e
    more words -> m o r e _ w o r d s*/

    public static void main(String[] args) {
        String message = "Hello world";
        message = message.replace(" ", "_");
        String newMessage="";
        int i = 0;
        for (i = 0; i < message.length(); i++) {
            newMessage += message.charAt(i)+" ";
        }
        System.out.println(newMessage);

    }

    }

