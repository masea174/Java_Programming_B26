package day37_wrappers_classes;

public class LowerAndUpper {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
     */
    public static boolean  equalUpperLower(String str){
        int countUpper=0;
        int countLower=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                countLower++;
            }else if(Character.isUpperCase(str.charAt(i))){
                countUpper++;
            }
        }if (countLower==countUpper){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(equalUpperLower("JAVA java"));
    }
}
