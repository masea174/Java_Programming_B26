package day29_array;

public class WebsiteChecker {
    /*
    Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain
Sample websites for an array:

     */
    public static void main(String[] args) {
        String [] url={"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int $com=0;
        int $org=0;
        int $edu=0;
        int $other=0;

        for(String site :url){
            if (site.contains(".com")){
                $com++;
            }else if(site.contains(".org")){
                $org++;
            }else if(site.contains(".edu")){
                $edu++;
            }else{
                $other++;
            }
        }
        System.out.println(".edu = " + $edu);
        System.out.println(".org = " + $org);
        System.out.println(".com = " + $com);
        System.out.println("other = " + $other);
    }
}
