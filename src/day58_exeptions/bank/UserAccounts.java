package day58_exeptions.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank account1=new Bank();
        account1.balance=1000;
        account1.withdraw(500);
        System.out.println(account1.balance);
//        account1.withdraw(2000);
//        System.out.println(account1.balance);
//
       try {
           account1.logIn("jamesbond","007" );
       }catch (InvalidCredentialsException e){
           System.out.println(e.getMessage());
       }
        try {
            account1.logIn("james","007" );
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }
        try {
            account1.logIn("jamesbond","07" );
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

    }
}
