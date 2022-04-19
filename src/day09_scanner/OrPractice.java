package day09_scanner;

public class OrPractice {
    public static void main(String[] args) {
        int apples=5;
        int oranges=10;

        System.out.println(apples>1||oranges<5);//true||false=>true
        System.out.println(apples>10||oranges==10);//false||true =>true
        System.out.println(apples>10 && oranges==10);
        //get discount if its friday ,you are a teachea ,police oficer ,or firefighter

        boolean isFriday =true;
        boolean teacher =true,
                firefighter=false,
                policeofficer=false,
                millitary=false;

//        System.out.println("Are we getting a discount :"+isFriday&&());
    }
}
