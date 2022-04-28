package day49_inheritance.homework;

public class Ebook extends Book{
    double size;
    int pages;

    public void reed(){
        System.out.println("Reading a digital copy of " + title);
    }
}
