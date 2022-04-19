package day14_practice;

public class ArmyEligebility {
    /*
    Declare and assign these variables: Citizenship(boolean), resident
(boolean), and has high school diploma (boolean), and age(int). Determine
if the person is qualified to join the army.
- The person must be a citizen or a resident
-> If not print: You must be a citizen or a resident
- Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years
old
- They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the Army

     */
    public static void main(String[] args) {
        boolean citizenship = true,
                resident = true,
                hasADiploma = true;
        int age = 19;

        if (citizenship == true || resident == true) {
            if (hasADiploma == true) {
                if (age <= 35 && age >= 18) {
                    System.out.println("\"You are qualified for army\"");
                }else{
                    System.out.println("you must be between 18 and 35 years old");
                }
            } else {
                System.out.println("You must have a high school diploma");
            }
        } else {
            System.out.println("you must be a citizen or resident");
        }
    }
}
