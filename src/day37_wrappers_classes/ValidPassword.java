package day37_wrappers_classes;

public class ValidPassword {
    /*
    Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *

     */
    public static String validPassword(String str){
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countSpecialCharacters=0;
        if(str.length()>7){
            for (int i = 0; i < str.length(); i++) {
                char letter= str.charAt(i);
                if(Character.isUpperCase(letter)){
                    countUpper++;
                }else if(Character.isLowerCase(letter)){
                    countLower++;
                }else if(Character.isDigit(letter)){
                    countNumber++;
                }else if(letter=='!' ||letter=='@'||letter=='#'||letter=='$'||letter=='%'||letter=='^'||letter=='&'||letter=='*'){
                    countSpecialCharacters++;
                }
            }
        }else return "Not Valid";
        return (countLower>0&&countNumber>0&&countUpper>0&&countSpecialCharacters>0)?"Yes a valid password":"Not Valid Password";
    }
}
