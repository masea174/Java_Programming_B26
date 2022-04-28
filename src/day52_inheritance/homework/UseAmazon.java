package day52_inheritance.homework;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount amazonAccount=new AmazonAccount("lolo","lolo@gmail.com",true);
        System.out.println(amazonAccount);
        System.out.println(amazonAccount.getEmail());
        System.out.println(amazonAccount.isHasPrime());
        System.out.println(amazonAccount.getUserName());
    }
}
