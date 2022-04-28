package day50_inheritance.book;

import day49_inheritance.homework.Ebook;

public class Library {
    public static void main(String[] args) {

        Book obj1=new Book();
        // obj1 has access to 6 instance variables

        AudioBook obj2=new AudioBook();
        //obj2 has acces to 6 var from book class plus the new 2 from the audio book;
        obj2.narrator="SOMEONE COOL";
        obj2.title="Java is fun";
        obj2.duration=100;
        obj2.listen();

        EBook obj3=new EBook();
        obj3.size= 23.4;
        obj3.pages=459;
        obj3.title="Soft skills is important";
        obj3.read();


        /// using the author information
        Book obj4=new Book();
        obj4.author=new Author("JK Rowling",40);// made an Author object it belongs to Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());


    }
}
