package day46_static;

public class UseBestBuy {
    public static void main(String[] args) {

        //access thr static numbers by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputers);

        BestBuy store1=new BestBuy("Oak Drive");
        System.out.println(store1.location);
        System.out.println(store1.numberOfComputers);

        store1.numberOfComputers--;
        System.out.println(BestBuy.numberOfComputers);

        BestBuy store2=new BestBuy("Main St");
        store2.numberOfComputers-=5;
        System.out.println(store1.numberOfComputers);

        BestBuy.reStock();
        store1.reStock();
        System.out.println(BestBuy.numberOfComputers);

       // BestBuy.openStore; this is an istance method it is not use strait to the class without object .

        store1.openStore();
        store2.openStore();
    }

}
