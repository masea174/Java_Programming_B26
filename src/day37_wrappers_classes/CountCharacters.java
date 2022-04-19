package day37_wrappers_classes;

public class CountCharacters {
    public static void main(String[] args) {
         String s="aP3d572&*jd@jdJU";
        int countUpper=0;
        int countLower=0;
        int countnumbers=0;
        int other=0;
        String upperCaseLetters="";

        for (int i = 0; i <s.length(); i++) {
            char letter=s.charAt(i);
            if(Character.isUpperCase(letter)){
                countUpper++;
                upperCaseLetters+=letter;
            }else if (Character.isDigit(letter)){
                countnumbers++;
            }else if(Character.isLowerCase(letter)){
                countLower++;
            }else{
                other++;
            }
        }
        System.out.println("countnumbers = " + countnumbers);
        System.out.println("countLower = " + countLower);
        System.out.println(upperCaseLetters+" countUpper = " + countUpper);
        System.out.println("other = " + other);
    }
}
