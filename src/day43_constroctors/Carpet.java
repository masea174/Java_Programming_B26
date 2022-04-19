package day43_constroctors;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;
    public Carpet(boolean inputPersian,double inputWidth,double inputLength,double inputUnitPrice){
        width=inputWidth;
        length=inputLength;
        isPersian=inputPersian;
        unitPrice=inputUnitPrice;
       calculatePrice();
    }
    public void calculatePrice(){
        totalPrice=width*length*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
    }
    public String toString(){
        return (isPersian?"The Persian carpet ":"The carpet ")+
                "\n has dimentions of "+length+" x "+width+
                "\n The unit price is $"+unitPrice+
                "\n all comming to a total of: $"+totalPrice;
    }

}
