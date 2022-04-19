package day44_costum_classes;

public class BankAccount {
    /*
    className --- > BankAccount   (instance vs Local  Var | instance Methods | Constr)

              fields / attributes / data that can have are:
                      1. AccountHolder, 2. AccountNumber, 3. Balance
*/
    String accountHolder;
    int accountN;
    double balance;

    public void checkBalance(){
        System.out.println("As of today, "+ accountHolder+"available balance is $"+balance);
    }
    public void deposit(double deposit){
        if(deposit<0){
            System.out.println("Depositing amount cant be less than 0");
        }else {
        System.out.println("Depoziting $"+deposit);}
        balance+=deposit;
    }
    public  void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insuficient balance");
        }else if(amount<1){
            System.out.println("Withdraw amount cant be below zero");
        }balance-=amount;
    }
    /*
              Methods (Actions)
                  1. CheckBalance,   2. deposit,  3. withdraw

              requirements:
                  1. user should be able to deposit money into their account --> deposit(double amount);
                      1.1 if the amount is less than or equal to 0
                               "Depositing amount can not be zero or negative"
                  2. user should be able to withdraw money from their account --> withdraw(double amount);
                      2.1 if the withdrawing account is greater than available balance
                                "Insufficient balance "
                      2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
                                "Withdrawing amount can not be negative or zero"
                  3. user should be able to see their balance --> checkBalance();
                      Example Output :
                              As of today , "+$accountName+"'  available balance is: "+$availableBalance
     */
}
