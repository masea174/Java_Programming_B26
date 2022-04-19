package day13_if_condition;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please insert the number coresponding to the language you pick: \n1 - English \n2 - Spanish \n3 - Turkish \n4 - Russian \n5 - French");
        int  language= input.nextInt();
        String message;

        if (language==2) {
            message = "\"hola, gracias para llamar\"";

            }else if(language==3){
             message="\"merhaba, aradiginiz icin tesekkurler\"";
             }else if(language==4){
             message=("\"privet, spasibo za vash zvonok\"");
                }else if(language==5){
               message=("\"Merci ,pour votre appel\"");
             }else {
                message=("\"hello, thank for your call\"");
    } System.out.println(message);
}}
