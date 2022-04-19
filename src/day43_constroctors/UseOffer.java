package day43_constroctors;

public class UseOffer {
    public static void main(String[] args) {
        Offer offer=new Offer("Apple","Silicon Valley");
        System.out.println(offer);

        Offer offer1=new Offer("Apple","Silicon Valley",150000);
        System.out.println(offer1);

        Offer offer2=new Offer("Apple","Silicon Valley",150000,true,15);
        System.out.println(offer2);
    }
}
