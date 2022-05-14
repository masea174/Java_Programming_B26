package day55_polymorphism.cloths;

public class Warderob {
    public static void main(String[] args) {
        //all posible reference ti the tshirt

        TShirts tShirts1=new TShirts();//reference itself

        tShirts1.wear();
        Clothes tShirts2=new TShirts();//reference of a parrent
        tShirts2.wear();

        Object tShirts3=new TShirts();

       // tShirts3.wear(); --doesnt compile because the Object class doesnt knoe the method from thechild class

      //  HasHood tShirt4=new TShirts(); doesnt work becasude there is no conection bettween all the classes the Tshirt doent impliments the hasHood interface

        // All possible objects of Jacket
        System.out.println();

        Jacket jacket1 = new Jacket(); // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); // reference of the super class
        jacket2.wear();
//        jacket2.putOnHood(); Clothes reference does not have access to a putOnHood()

        Object jacket3 = new Jacket(); // reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class does not have reference to wear() or putOnHood() methods

        HasHood jacket4 = new Jacket();
//        jacket4.wear(); HasHood reference does not have visibility to wear() method
        jacket4.putOnHood();




    }
}
