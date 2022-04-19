package day29_array;

import java.util.Locale;
import java.util.Scanner;

public class Countries {
    /*
    Countries
Given a String array of countries: String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
};
- Find and print all the first and last characters of each country
- Find and print all the countries that end with the letter ‘a’
- Create “contains logic” to check if there is a certain country in the array. Can check for the United States, or use Scanner to check any country
     */

    public static void main(String[] args) {
        String []countries={"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        for(String each:countries){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        }
        System.out.println();
        for(String every:countries){
           if(every.charAt(every.length()-1)=='a')
            System.out.println(every);
        }
        System.out.println("");
        boolean containsContry=false;
        Scanner input =new Scanner(System.in);
        System.out.println("Plese enter the country you a looking for:");
        String country=input.nextLine().trim();
        country=(""+country.charAt(0)).toUpperCase()+country.substring(1);
        for(String check:countries){
            if(check.equals(country)){
                containsContry=true;
            }
        }
        System.out.println(containsContry?"Yes the range contains "+country:"No it doesn't");

    }

}