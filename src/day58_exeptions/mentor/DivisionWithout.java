package day58_exeptions.mentor;

public class DivisionWithout {
    public static void main(String[] args) {
        division(15,6);

    }
    /*
    create a method to divide 2 numbers withou using the /
     */
    public static void division(int a,int b){
        int count=0;
        while(b<a){
            a=a-b;
            count++;
        }
        System.out.println(count);
    }
}
