package day57_exeptions.webelement;

public class Google {
    public static void main(String[] args) {

        WebElement link= new Link();//Create a link object with WebElement reference

        WebElement input=new Input();//Created an input object with Web Element reference

        WebDriverUtil.clickElement(link);

        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(new Link());

WebElement[]allElements=new WebElement[4];// created an array that will store from classes that will implement WebElement interface
        allElements[0]=link;//Link obj
        allElements[1]=input;//Input obj
        allElements[2]=new Input();// input object
allElements[3]=new Image();


    }
}
