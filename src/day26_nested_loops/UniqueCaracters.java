package day26_nested_loops;

public class UniqueCaracters {
    /*
    Unique characters

Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique
     */
    public static void main(String[] args) {
        String s = "anaggydddbsk";
        String uS = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char letter = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char checked = s.charAt(j);
                if (letter == checked) {
                    count++;
                }
            }
            if (count < 2) {
                uS += letter;
            }
        }
        System.out.println(uS);
    }
}

