package day58_exeptions.homework;

public class OutOfInkException extends RuntimeException {
    /*
    Create a class OutOfInkException
    inherit the RuntimeException class to create an unchecked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor

     */
    public OutOfInkException(String str){
        super(str);
    }

}
