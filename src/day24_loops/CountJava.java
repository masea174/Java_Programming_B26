package day24_loops;

public class CountJava {
    public static void main(String[] args) {
        String mess="java is a java language, java ,java";
        /*
        use substrings 0,4
         */
        int count =0;
        for (int i = 0; i <mess.length()-3; i++) {
            if (mess.charAt(i)=='j'&& mess.charAt(i+1)=='a'&&mess.charAt(i+2)=='v'&&mess.charAt(i+3)=='a'){
                count+=1;
            }
            
        }
        System.out.println("count = " + count);

        System.out.println("============================Saims way======================");

        String str="java is a java language, java ,java";
        int numb=0;

        for (int i = 0; i < str.length()-3 ; i++) {
            String everyFour = str.substring(i, i + 4);
            System.out.println(everyFour);
            if (everyFour.equals("java")) {
                numb++;
                /* we did substring for every 4 characters in the String and than checked the value to be equal to "java"
                 * so to fix it our lengh had to be redused with -3 to check last 4 characters */

            }

        }
        System.out.println("numb = " + numb);

        System.out.println("===========================replace first ============================");

                String str1="javavavavajavavavvajavajava";
        int apperence=0;
        while (str1.contains("java")) {

            str1 = str1.replaceFirst("java", "*");
            apperence++;
            System.out.println(str1);
        } System.out.println(apperence);
            System.out.println(str1);
}}

