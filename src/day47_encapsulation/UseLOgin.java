package day47_encapsulation;

public class UseLOgin {
    public static void main(String[] args) {


    Login obj=new Login();
//    obj.userName="JamesBond";
//    obj.passwords="1234";

        //cannot access private variables directctly

        obj.setUserName("jamesbond");
        obj.setPasswords("1234");
        System.out.println(obj.getPasswords());
        System.out.println(obj.getUserName());


        obj.setPasswords("jhahkgdajhksgjh77");
        System.out.println(obj.getPasswords());
}}
