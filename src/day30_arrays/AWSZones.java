package day30_arrays;

public class AWSZones {
    /*
    AWS Zones

Given an app name and a String of zones in the following format

	us-east-1,us-west-1,us-west-2,us-west-3

	print the app deploying to each zone

Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1

    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
     */
    public static void main(String[] args) {

    String app="etsy";
    String zones="us-east-1,us-west-1,us-west-2,us-west-3";
    String [] z=zones.split(",");
    for(String each:z){
        System.out.println("Deploying "+ app+" to "+each+"...");
        System.out.println("Deployment completed for "+each);
        System.out.println();
    }
}}
