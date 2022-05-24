package day58_exeptions.bank;

public class Bank {
    double balance;

    public void withdraw(double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new NotEnouthMoneyException("Balance only have " + balance);
        }
        balance -= amountToTakeOut;
    }
    //In this method we creE CHECKED EXCEPTION , SO THEY MUST BE HANDLED , BUT WE CREADED THE CLASS TO ALLOW THE PROGRAM TO COMPILE SO THE USER OF THE CLASS WILL HAEVE TO TAKE CARE OF THE EXCEPTIONS
    public void logIn(String userName,String password) throws InvalidCredentialsException {
        if(!userName.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid userName");
        }
        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid Password");
        }
        System.out.println("LOGIN");
    }

}
