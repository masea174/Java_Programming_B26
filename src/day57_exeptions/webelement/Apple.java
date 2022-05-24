package day57_exeptions.webelement;

import day49_inheritance.Animal;
import day52_inheritance.hiding.A;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {
        Form obj=new Form();
        Link obj2=new Link();
        Input obj3=new Input();
        Image obj4=new Image();

        ArrayList<WebElement> elements=new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);

        for (WebElement each:elements){
            System.out.println(each.getText());
            if(each instanceof Form){   //are you a Form Object ; if yes the submit() will be executed and read the method

                ((Form) each).submit();
            }
        }
        WebElement logo=new Image();
        logo.click();// is accesible by interface , it have it there but its implimented in the child class this will be executed


       // logo.extention=".jpg"; the webElemnt interface doent have accesabity to the variable we have to cast.

        ((Image)logo).extention=".jpg";

        //((Image)logo)--> cast the logo(Web elemnt  reference) to an Image reference , then the Image reference as access to the extention variable

        //option 2
        Image logoAsImage=((Image)logo);

        logoAsImage.extention=".jpg";
        name(logo);
        name(obj);


    }
    public static void name(WebElement obj){
        System.out.println(obj);

    }

    public static Animal returnType(String species){
        return new Animal(species ) ;

}}
