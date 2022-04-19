package day24_practice;

public class IDPAss {
    /*
    Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8

     */
    public static void main(String[] args) {
        String first="john";
        String last ="smith";
        System.out.println(first.charAt(0)+(""+last.charAt(0)).toUpperCase()+last.substring(1,3)+(first.length()*2));



    }
}
