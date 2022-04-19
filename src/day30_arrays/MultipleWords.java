package day30_arrays;

public class MultipleWords {
    /*
    Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
___________________________
     */
    public static void main(String[] args) {
        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] s=str.split(", ");
        for (String each:s){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }
    }
}
