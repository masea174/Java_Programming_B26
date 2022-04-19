package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s="pen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("x"));
        System.out.println(s.indexOf("pe"));//0 because p is in 0 pozition
        System.out.println(s.indexOf("pz"));//-1 because no sequence
        System.out.println(s.indexOf("pn"));// -1 has to be in sequence, one after another one

    }
}
