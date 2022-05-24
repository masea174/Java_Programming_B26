package day60_collections.social_media;

import day54_abstractions.create_interface.Create;

import javax.print.attribute.standard.Media;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Set;

public class Facebook extends SocialMedia implements Group {

    /*

Facebook

• Create a class for a Facebook which inherits the SocialMedia class and has
additional instance variables:
age, number of friends, and posts (ArrayList of Post)

     */private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    static {
        platform = "Facebook" ;
    }

    public Facebook(String username, String password) {
        this.username = username;
        if (password.contains(username)) {
            System.out.println("Password contained username the default password created:\"password\"");
            this.password = "password" ;
        } else {
            this.password = password;
        }
        this.personalUrl = "facebook.com/" + username;
        posts = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName) {
        this(username, password);
        int count = 0;
        for (char each : fullName.toCharArray()) {
            if (Character.isUpperCase(each) || Character.isLowerCase(each) || each == ' ') {
                count++;
            }
        }
        if (fullName.length() != count) {
            System.out.println("Invalid name");
            this.fullName = "no name" ;
        } else {
            this.fullName = fullName;
        }

    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);
        if (age < 0) {
            System.out.println("Invalid age");
            setAge(0);
        } else {
            setAge(age);
        }
        if (numberOfFriends < 0 || numberOfFriends > 5000) {
            System.out.println("invalid number of friends");
            setNumberOfFriends(0);
        } else {
            setNumberOfFriends(numberOfFriends);
        }
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);

    }

    @Override
    public void post(Object media) {

        posts.add((Post)media);

    }

    @Override
    public void notifications() {

        if (LocalTime.now().getHour() >= 8 && LocalTime.now().getHour() <= 17) {

            System.out.println("Notifications");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
    public boolean sendFriendRequest(Facebook friend){
        if(numberOfFriends>=5000) {
            System.out.println("You have reached the limit of friends");
            return false;
        }
        if(friend.numberOfFriends>=5000){
            System.out.println(friend.username+" cannot accept any more friend requests");
            return false;
        }if (friend.numberOfFriends<5000&&numberOfFriends<500){
            System.out.println("Friend request sent to"+friend.username);
            numberOfFriends++;
            friend.numberOfFriends++;
        }return true;
    }
    int numberOfGroups;

    @Override
    public void joinGroup(String group) {
        System.out.println(username+" joined the "+group);
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(username+" has left the "+group);
        numberOfGroups--;
    }
    /*

• Create a sendFriendRequest method that will accept a Facebook object and
send them a friend request. The method should return a boolean:

if the friend request was sent (true) or if the friend request was not
sent (false).
 - If your friend list is at the 5000 limit then do not send the
request and print “You have reached the limit of friends.”
 - If the user you are trying to send the request to has already hit
the limit, then print “$theUsersName cannot accept any more friend
request.
 - If both the user and you are under the limit print “Friend
request sent to $theUsersName” and increase your number of friends
by one.




     */
}
