package day30_arrays;

public class URLparts {
    /*
    URL Parts

Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
     */
    public static void main(String[] args) {
        String url="https://learn.cydeo.com/courses/130";
        String []u=url.split("/");
        for(String each:u){
            System.out.println(each);
        }
    }
}
