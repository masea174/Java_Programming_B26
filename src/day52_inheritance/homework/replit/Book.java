package day52_inheritance.homework.replit;

public class Book {
    //instance variables for Book object
    private String author;
    private String title;
    private int id;
    private int pages;
    //static variable to track number of books with unknown author
    private static int unknownAuthors;

    /**
     Utility static method: capitalize
     accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
     if argument is empty, it returns an empty String ""
     capitalize("jAVa") => "Java"
     capitalize("HTML") => "Html"
     capitalize("") => ""
     This method will be used in setAuthor(), setTitle() methods
     */

    public static String capitalize(String word) {
      String checked;
      if(word.isEmpty()){
          return "";}
      else {
          return ("" + word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
      }
    }

    public Book() {
    }
    public Book(String author, String title, int id, int pages) {
        setAuthor(author);
        setTitle(title);
        setId(id);
        setPages(pages);
    }

    /**
     Utility static method: isTitleWord
     -This method will be used in setTitle() method
     -Accepts a words to check if it is a part of the title or just an article etc.
     - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
     -else method returns true
     Articles:
     "a" , "an", "the"
     Coordinate conjunctions:
     "and", "but", "for", "nor", "or", "so", "yet"
     Most common single-word English prepositions:
     "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"

     isTitleWord("Apple") => true
     isTitleWord("a") => false
     isTitleWord("BUT") => false
     isTitleWord("THE") => false
     isTitleWord("neaR") => false
     isTitleWord("java") => true
     */

    public static boolean isTitleWord(String word) {
        String containingWord;
        switch (word.toLowerCase()){
            case "a":
            case"an":
            case "the":
            case"and":
            case"but":
            case"for":
            case"nor":
            case"or":
            case"so":
            case"yet":
            case"at":
            case"by":
            case"in":
            case"into":
            case"near":
            case"of":
            case"on":
            case"to":
            case"than":
            case"via" : return false;
    }return true;}

    /**
     * No args constructor. Stays empty
     */
    /**
     * 4 args constructor. accepts id, author, title, pages
     * CALLS SETTER methods to assign to instance variables.
     * ex: setId(id);
     * It does NOT directly assign to the instance variable
     * ex: NO => this.id = id;
     */

    /**
     * setAuthor method will be used to set value to private author of the Book
     * @param author : String
     * Conditions:
     *    => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
     *                                             2) static unknownAuthors is incremented by one.
     *    => Each word in Book author's name should be capitalized. CALL capitalize method
     *  Example:
     *  Book b = new Book();
     *  b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
     *  b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
     *  b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
     */

    public void setAuthor(String author) {
    if(author.isEmpty()){
    this.author="Unknown";
    unknownAuthors++;}
    else{if(author.contains(" ")) {
        int indexOfSpace=author.indexOf(" ");
        this.author=(""+author.charAt(0)).toUpperCase()+author.substring(1,indexOfSpace+1).toLowerCase()+ (""+author.charAt(indexOfSpace+1)).toUpperCase()+author.substring(indexOfSpace+2).toLowerCase();
    } else{
        this.author= (""+author.charAt(0)).toUpperCase()+author.substring(1).toLowerCase();}

}
}



    /**
     * setTitle method will be used to set value to private title of the Book
     * @param title : string
     * Conditions:
     *   => if title is single word, capitalize it and assign to this.title.
     *   => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
     *   => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
     *              See full list in isTitleWord method, they need to be all lowercase.
     *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
     *              -> Call capitalize method to capitalize title words.
     *   => First word is always capitalized regardless if it is article etc.
     *   Ex:
     *      Book book = new Book();
     *      book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
     *
     *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
     *
     *
     */

    public void setTitle(String title) {
        if(!title.contains(" ")) {
            this.title = ("" + title.charAt(0)).toUpperCase() + title.substring(1).toLowerCase();
        }else if(title.isEmpty()){
            this.title="";}
        else {
            String fixed ="";
            String [] titleArray=title.split(" ");
            for(String each:titleArray){
                each=each.toLowerCase();
                if(isTitleWord(each)){
                    fixed+=("" + each.charAt(0)).toUpperCase() + each.substring(1).toLowerCase()+" ";
                }else {
                    fixed+=each+" ";
                }
            }this.title=fixed.trim();
    }}

    /**
     * toString instance method, String representation of the Book object
     * @return String
     * Format includes author, title, id, pages of the Book object:
     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
     */
        @Override
        public String toString() {
            return "Book[" +
                    "author='" + author +
                    ", title='" + title  +
                    ", id=" + id +
                    ", pages=" + pages +
                    ']';
        }



    /**
     * Getter methods for static unknownAuthors
     * @returns unknownAuthors value
     */

    public static int getUnknownAuthors(){

        return unknownAuthors;
    }

    /**
     * Getter methods for private pages
     * @returns pages value
     */

    public int getPages() {

        return pages;
    }

    /**
     * Setter method for private pages. No conditions
     * @param pages
     */

    public void setPages(int pages) {
this.pages=pages;
    }

    /**
     * public Getter method for private author
     */

    public String getAuthor() {

        return author;
    }


    /**
     * public Getter method for private title
     */

    public String getTitle() {

        return title;
    }

    /**
     * public Getter method for private id
     */
    public int getId() {


        return id;
    }

    /**
     * public setter method for private id
     */
    public void setId(int id) {
     this.id=id;
    }

}


