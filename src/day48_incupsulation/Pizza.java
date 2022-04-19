package day48_incupsulation;

public class Pizza {

    private String size;
    private int numberOfToppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch(size.toLowerCase()){
            case "large":
            case "small":
            case "medium":
        this.size = size;
    }}

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public void setNumberOfToppings(int numberOfToppings) {
       if(numberOfToppings>0){
        this.numberOfToppings = numberOfToppings;
    }}
    public double calculatePrice(){
        if (size==null){
           return -1;
        }
        double price =size.equalsIgnoreCase("small")?4:size.equalsIgnoreCase("medium")?6:8;
        return price+(numberOfToppings*0.75);

    }

    @Override
    public String toString() {
        return "Pizza " +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
               " Total price will be $"+ calculatePrice();
    }
}
