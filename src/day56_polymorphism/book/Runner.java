package day56_polymorphism.book;


import day55_polymorphism.homework.Downloadable;

public class Runner {
    public static void main(String[] args) {

        day56_polymorphism.book.JavaTextBook book1=new JavaTextBook();
        book1.fun=true;
        book1.name="JAva Text Book";
        book1.size=10.6;
        book1.open();
        book1.download();
        book1.read();
        System.out.println();



        Ebook book2=new JavaTextBook();
        book2.name="Java";
        book2.size=12.4;
        book2.download();
        book2.open();
        book2.read();
        System.out.println();

        Book book3=new JavaTextBook();
        book3.name="Java";
        book3.read();

        System.out.println();
        Downloadble book4=new JavaTextBook();
        book4.download();

    }
}
