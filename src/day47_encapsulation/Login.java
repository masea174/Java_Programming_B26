package day47_encapsulation;

public class Login {

   private String userName;
   private String passwords;

   public void setUserName(String userName){
       this.userName=userName;
   }
   public void setPasswords(String passwords){
       if(passwords.length()>8){
       this.passwords=passwords;}
   }
   public String getUserName(){
       return userName;

   }public String getPasswords(){
       return passwords;
    }

}
