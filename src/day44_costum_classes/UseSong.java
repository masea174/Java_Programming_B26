package day44_costum_classes;

public class UseSong {
    public static void main(String[] args) {
        Song song1= new Song("Waka,waka");
        System.out.println(song1);
        Song song2=new Song("Viva la vita",3.5);
        System.out.println(song2);
        Song song3=new Song("Tjriller",4.0,"Michael Jakson","Pop");
        System.out.println(song3);
    }
}
