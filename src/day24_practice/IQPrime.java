package day24_practice;

public class IQPrime {
    /*

[IQ] Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime
     */
    public static void main(String[] args) {
        int a=17;
        boolean isPrime=true;
       for( int i=2; i>a;i++){
           if( a % i == 0){
               isPrime = false;
               break;
           }
       } if(isPrime){
            System.out.println(a + " is prime");
        }else {
            System.out.println(a+ " not prime");
        }
           }
       }

