package day27_nested_loops_practice;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String s = "aanbbuytvvv";
        String doubles = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!(doubles.contains(""+letter))){      // if (doubles.contains(""+letter)){
                                                            //continue;                     -it will skip all the code to be run  , the programes avoid using this words

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                char letter2 = s.charAt(j);
                if (letter2 == letter) {
                    count++;
                }
            }
            if (count > 1 ) {
                doubles+=letter+" ";
            }

        }}
        System.out.println(doubles);
    }
}
