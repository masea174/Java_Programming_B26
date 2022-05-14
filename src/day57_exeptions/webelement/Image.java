package day57_exeptions.webelement;

import day52_inheritance.hiding.Soccer;

public class Image implements WebElement {
    @Override
    public void click() {
        System.out.println("Clicking the image");
    }

    @Override
    public String getText() {
        return "Text Description";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Uploading pictures");
    }
}
