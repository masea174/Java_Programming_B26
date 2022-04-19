package day34_return_methods;

public class Currency {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */

public static double currencyConvertor(String a, double b){

    a=a.toLowerCase();
    switch (a){
        case "euro":
            return 0.91*b;
        case "yen":
            return 121.03*b;
        case "lira":
            return 14.85*b;
        case "won":
            return 1217.52*b;
        case "rupee":
            return 181.45*b;
        default:
            return 0;
    }
}

    public static void main(String[] args) {
        System.out.println(currencyConvertor("yen",100));
    }
}