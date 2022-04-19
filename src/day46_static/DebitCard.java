package day46_static;

public class DebitCard {
    /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line
     */
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;
    static String accountType;
    static {
        accountType="checking";
    }

    public DebitCard(long cardNumber, String holderName, double balance) {
        if( cardNumber>999999999999999l&&cardNumber<10000000000000000l){
        this.cardNumber = cardNumber;}
        else{
            System.out.println("Invalid card number");
            System.out.println();
        }
        this.holderName = holderName;
        this.balance = balance;
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber,holderName,balance);
        if(cardType.equals("Visa")||cardType.equals("MasterCard")){
        this.cardType = cardType;}
        else {
            System.out.println("invalid card type");
        }if(pin>999&&pin<10000){
        this.pin = pin;}
        else{
            System.out.println("Invalid pin");
        }

    }

    @Override
    public String toString() {
        String message= "DebitCard " +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance ;
        if (!(cardType.isEmpty())){
            message+=" cardType ="+cardType;
        }return message;
    }
}
