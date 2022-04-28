package day51_ihneritance.lyft;

public class Lyft {
    String  name;
int miles;
    public Lyft(String name, int miles) {
        this.name = name;
        this.miles=miles;
    }
    public double calculateRate(int miles){
        return miles*1.5;
    }
}
class UseLyft{
    public static void main(String[] args) {
        Lyft car=new Lyft("",10);
    }
}