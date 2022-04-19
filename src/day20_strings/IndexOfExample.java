package day20_strings;

public class IndexOfExample {
    public static void main(String[] args) {
        String word="banana";
        //           012345
        int firstIndex=word.indexOf("a");
        int secondIndex= word.indexOf("a",2);
        int lastindex=word.lastIndexOf("a");
        System.out.println(firstIndex);
        System.out.println(secondIndex);
        System.out.println(lastindex);

    }
}
