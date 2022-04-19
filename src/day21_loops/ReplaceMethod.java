package day21_loops;

import javax.lang.model.element.NestingKind;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message= "java is a language";
        message=message.replace('a','e');
        System.out.println(message);

        String day= "Today is Monday, Monday not a good Monday";
        day=day.replace("Monday","Tuesday");
        System.out.println(day);
        String str= "Today is Monday. Monday not a. good Monday";
        str=str.replaceFirst("Monday","Tuesday");
        System.out.println(str);
        String target= "Today is Monday. Monday not a. good Monday";
        int firstIndex=target.indexOf('.');
        int lastIndex=target.lastIndexOf('.');
        String myMiddleStr=target.substring(firstIndex,lastIndex);
        myMiddleStr=myMiddleStr.replace("Monday","weekday");
        System.out.println(target.substring(0,firstIndex)+myMiddleStr+target.substring(lastIndex));

    }
}
