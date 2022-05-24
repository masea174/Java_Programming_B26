package day60_collections.social_media;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    /*
    Post class

• Create a class that has the following instance variable:
 String body, and String dateTime

 - Encapsulate body. Provide a public getter and setter
 - Make dateTime final, private, read only (getter, but no setter)

• Create a constructor that will take and initialize the body instance variable.
Upon creation of the post the current date and time should be taken and
stored into the dateTime variable. Use the code given below

Note: Since we didn’t learn this class use the follow code:

     */
   private String body;
    final private String dateTime;

    public Post(String body, String dateTime) {
        this.body = body;
        this.dateTime =LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }
}

