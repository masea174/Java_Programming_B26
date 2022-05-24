package day61_maps.CoddingBat;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end){
        String words="";
        for (int i = start; i < end; i++) {
            if(i%3==0&&i%5==0){
                words+= "FizzBuzz"+" ";
            }else if(i%3==0){
                words+="Fizz"+" ";
            }else if(i%5==0){
                words+="Buzz"+" ";
            } else{
                words+=i+ " ";
            }

        }

        return words.split(" ");
    }
}
