package day57_exeptions.webelement;


public class Link implements WebElement{
    @Override
    public void click() {
        System.out.println("Clicking Linked");
    }

    @Override
    public String getText() {
        return "Link Text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Sending txt to link");
        System.out.println(txt);
    }
}

