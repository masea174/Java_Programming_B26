package day29_array;

public class ShortestAndLongest {
    public static void main(String[] args) {
       String [] str={"apples","java","computer","water","apa","hi"};
        String smalest = str[0];
        String biggest = str[0];
        for(String each:str){
            if(smalest.length()>each.length()){
                smalest=each;
            }if (biggest.length()<each.length()){
                biggest=each;
            }
        }
        System.out.println("biggest = " + biggest);
        System.out.println("smalest = " + smalest);
}}

