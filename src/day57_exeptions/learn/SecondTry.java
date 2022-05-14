package day57_exeptions.learn;

public class SecondTry {
    public static void main(String[] args) {

        try{
           // String s=null;

            String s="java";
            System.out.println(s.length());

            int [] a={1,2,3,4};
            System.out.println(a[10]);

        }catch(NullPointerException e){
            System.out.println("caught a null pointer exeption");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the index out of bounds");
        }

        System.out.println("Done");
    }
}
