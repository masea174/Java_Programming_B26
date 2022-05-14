package day57_exeptions.webelement;


    /*create an interface WebElement
        create abstract methods:
            void click()
            String getText()
            void sendKeys(String txt)
     */
    public interface WebElement {

        void click();
        String getText();
        void sendKeys(String txt);

    }
