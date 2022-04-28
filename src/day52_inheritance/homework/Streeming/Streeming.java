package day52_inheritance.homework.Streeming;

import java.util.ArrayList;

public class Streeming extends Entertaiment{

    double duration;
    public Streeming( String company,double duration) {
        super("Streaming", company);
        this.duration=duration;
    }

}
class Netflix extends Streeming{

    String showName;
    int episodeNumber;
    int season;

    public Netflix(double duration, String showName, int episodeNumber, int season) {
        super("Netflix", duration);
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.season = season;
    }
}
class YouTube extends Streeming{
    String videoName;
    String channelName;
    int viewsCount;
    ArrayList <String> comments;

    public YouTube( double duration, String videoName, String channelName, int viewsCount, ArrayList<String> comments) {
        super("YouTube", duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewsCount = viewsCount;
        this.comments = comments;
    }
}
class LiveShow extends Entertaiment{
    String location;

    public LiveShow( String company, String location) {
        super("Live Show ", company);
        this.location = location;
    }
}
class KevinHart extends LiveShow{
    String performer;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate( int month, int day, int year) {
        this.date = month+"/"+day+"/"+year;
    }

    public KevinHart( String location, String performer, int month, int day, int year) {
        super("Kevin Hart", location);
        this.performer = performer;
        setDate(month,day,year);
    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "performer='" + performer + '\'' +
                ", date='" + getDate() + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
class UsingStreeming{
    public static void main(String[] args) {
        KevinHart obj1=new KevinHart("BALTIMORE","Hart",05,31,2022);
        System.out.println(obj1);
    }
}
