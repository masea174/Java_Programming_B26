package day35_methods;

import my_library.StringUtil;

public class UniqCaracters {
    public static String uniqCharacters(String s) {
        String unique = "";
        String checked="";
        for (int i = 0; i < s.length(); i++) {
            if(checked.contains(""+s.charAt(i))){// it will avoid to run the same code 10 times
                continue;
            }
            int count = StringUtil.frequencyOfCharacter(s, s.charAt(i));
            checked+=s.charAt(i);
            if (count == 1) {
                unique += s.charAt(i);
            }}
            return unique;
        }}

