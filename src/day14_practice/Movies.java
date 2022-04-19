package day14_practice;

public class Movies {
    /*
    The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes
duration of less than or equal to 0:
Movies cannot be less than 0 minutes
duration of more than 4:
Movies cannot be more than 4 hours
for all other duration uses the following values to display the
price of the tickets
duration --> price
1.0 --> 8.99
1.5 --> 10.50
2.0 --> 12.99
2.5 --> 14.50
3, 3.5 or 4 --> 15.99
------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        double movie = 2,
                ticket = 0;
        String message = "";

        if (movie > 0 && movie <= 4) {
            if (movie <= 1) {
                ticket = 8.99;
            } else if (movie <= 1.5) {
                ticket = 10.5;
            } else if (movie <= 2) {
                ticket = 12.99;
            } else if (movie <= 2.5) {
                ticket = 14.50;
            } else {
                ticket = 15.99;
            }
            System.out.println("the price for one ticket of  the " + movie + " hour movie will be : $ " + ticket);

        } else {
            if (movie <= 0) {
                message = "Movies can not be less than 0 minutes";
            } else {
                message = "movie cannot be more than 4 hours";
            }
            System.out.println(message);
        }

}

}