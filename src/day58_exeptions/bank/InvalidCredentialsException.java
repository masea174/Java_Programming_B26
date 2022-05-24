package day58_exeptions.bank;

public class InvalidCredentialsException extends Exception{
    // this is a checke exeption because the parents is a exaption class

    public InvalidCredentialsException(String msg){
        super(msg);
    }




}



