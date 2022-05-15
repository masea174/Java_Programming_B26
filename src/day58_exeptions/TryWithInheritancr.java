package day58_exeptions;

public class TryWithInheritancr {
    public static void main(String[] args) {
        try {//start with more specific and then go to general .

        }catch(IndexOutOfBoundsException e){

        }catch (RuntimeException e){

        }catch (Exception e){

        }
        /*
        Possible reference for IndeOutOfBounceException

       IndeOutOfBounceException obj= new IndeOutOfBounceException ();
       RuntimeException obj= new IndeOutOfBounceException ();
       Exception obj= new IndeOutOfBounceException ();
         */
    }
}
