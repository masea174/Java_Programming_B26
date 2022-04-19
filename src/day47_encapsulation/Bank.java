package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);
        DebitCard obj1=new DebitCard(5234562738228876L,"James",10000000);
        System.out.println(obj1);

        System.out.println();
        DebitCard obj2 =new DebitCard(1524273638298l,"Ben",1000002);
        System.out.println(obj2);

        System.out.println();
        System.out.println(DebitCard.accountType);
        DebitCard obj3=new DebitCard(1234562738892928L,"James","Visa",7888,10000000);
        System.out.println(obj3);

    }

}
