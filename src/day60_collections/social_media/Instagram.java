package day60_collections.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia{

   private int numberOfFollowers;
    private int numberOfFollowing;
   private ArrayList<Picture> pictures;
    static {
        platform="Instagram";
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    public Instagram(String username,String password) {
       this.username=username;
       this.password=password;
       personalUrl="Instagram.com/"+username;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message+" sent to "+username);
    }

    @Override
    public void post(Object media) {

        pictures.add((Picture)media);
    }

    @Override
    public void notifications() {
        if (LocalTime.now().getHour() >= 10 && LocalTime.now().getHour() <= 20) {

            System.out.println("Notifications");
        } else {
            System.out.println("Sleep mode");
        }

    }
/*


o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.

     */
}
