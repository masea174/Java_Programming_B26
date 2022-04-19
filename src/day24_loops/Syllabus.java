package day24_loops;

public class Syllabus {
    public static void main(String[] args) {
        String s="ja-va-blah-blah-blah";
        int syllabus=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                syllabus++;
            }
        }
        System.out.println("syllabus = " + syllabus);
    }
}
