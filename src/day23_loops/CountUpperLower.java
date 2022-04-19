package day23_loops;

public class CountUpperLower {
    /*
    Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
     */
    public static void main(String[] args) {
        String mess="HJhjaHJHDADHAJHA9A8DA987392492RH2EHR";
        int upperCase=0;
        int lowerCase=0;
        int numbers=0;

        for( int index=0;index<mess.length();index++){
            if (mess.charAt(index)>='A'&&mess.charAt(index)<='Z'){
                upperCase+=1;
            }if(mess.charAt(index)>='a'&& mess.charAt(index)<='z'){
                lowerCase+=1;
            }if(mess.charAt(index)>='0'&& mess.charAt(index)<='9'){
                numbers+=1;
            }
        }
        System.out.println("numbers = " + numbers);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("upperCase = " + upperCase);
    }
}
