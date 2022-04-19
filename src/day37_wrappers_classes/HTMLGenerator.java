package day37_wrappers_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class HTMLGenerator {
    /*
    HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
     */
    public static String htmlGenerator(String str) {

        String str2="";
        String[]arr=str.split("\\^");
        System.out.println(Arrays.toString(arr));
        int a=Integer.parseInt(arr[1]);
        while (a-->0){
            str2+="<"+arr[0]+"></"+arr[0]+"> ";

        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(htmlGenerator("li^3"));
    }
}
