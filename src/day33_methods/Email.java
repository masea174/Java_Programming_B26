package day33_methods;

public class Email {
    /*
    build an email
     */
    public static void buildEmail(String name,String domain){
        String email=name.substring(0,1);
        int indexSpace=name.indexOf(" ");
        email+=name.substring(indexSpace+1,indexSpace+4);
        email+="@"+domain+".com";
        System.out.println(email);

    }

    public static void main(String[] args) {
        buildEmail("James Bond","gmail");
        buildEmail("Anna Smith","yahoo");
        buildEmail("Diana Bulgac","tesla");
    }
}
