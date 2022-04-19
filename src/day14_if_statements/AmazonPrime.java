package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        /*
        declare and asign the price variable of the item
        declare and asign boolean -hasPrime variable

        possible outputs
        prime member :eligible for 2 day shippng;
        not prime :item price >25 :
                eligible for regualar free shipping
         not prime item price <25
                not eligble for free shipping. Shiping fee :3.99
         */

        double price=24.99;
        boolean hasPrime= false;

        if (hasPrime){
            System.out.println("Eligble for 2 day shipping ");
        }else{
            if (price>=25){
                System.out.println("eligible for regualar free shipping ");
            }else {
                System.out.println("not eligble for free shipping. Shiping fee :3.99");
                price +=3.99;
                System.out.println(price);

            }
        }

    }
}
