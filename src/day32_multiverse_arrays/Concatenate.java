package day_32_multiverse_arrays;

public class Concatenate {
    /*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

Ex:

	{"James", "is", "back"}
	{"he", "was", "never", "gone"}
	{"methods", "tomorrow"}

Output:
	ssk
	esre
	sw

     */
    public static void main(String[] args) {
        String [][] str={
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };
        for (int i = 0; i < str.length; i++) {
            String last="";
            for (int j = 0; j < str[i].length; j++) {
                last+=str[i][j].charAt(str[i][j].length()-1);
            }
            System.out.println(last);
        }
    }
}
