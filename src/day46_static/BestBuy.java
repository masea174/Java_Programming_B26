package day46_static;

public class BestBuy {
    String location;
    static String headquarters="Richfield, Minisota, United States";
    static String day="Wendnesday";
    static int numberOfComputers=100;

    public BestBuy(String location) {
        this.location = location;
    }
    public static void  reStock(){
        numberOfComputers+=20;
    }
    public void openStore(){
        System.out.println("Opening the "+location);
    }

}
