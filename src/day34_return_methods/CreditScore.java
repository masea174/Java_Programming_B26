package day_34_return_methods;

public class CreditScore {
    public static int getCreditScore(){
        return 800;
    }

    public static void main(String[] args) {
       // getCreditScore() we cant use it just like this
        int score=getCreditScore();
        System.out.println(score);
        System.out.println(getCreditScore());
        System.out.println(getCreditScore()+50);
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println(isGoodCreditScore(680));
    }
    public static boolean isGoodCreditScore(int creditScore){
//        if (creditScore>=700){
//            return true;
//        }else{
//            return  false;
        return creditScore>=700;
        }
    }

