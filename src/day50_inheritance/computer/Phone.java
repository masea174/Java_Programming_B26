package day50_inheritance.computer;

public class Phone {
    public Phone() {
        System.out.print(1);
    }
public Phone(int num) {
        this();
        System.out.print (2);
    }
    public Phone(String str) {
        this(str.length());
        System.out.print(3);

    }}
    class CellPhones {
        public static void main(String [] args){
            new Phone ("iphone");
            new Phone();
            new Phone(4) ;
}
    }