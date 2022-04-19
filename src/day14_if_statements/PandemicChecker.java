package day14_if_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce the year :");
        int year= input.nextInt();
        String pandemic;

        if (year>=1346 && year<=1352){
            pandemic=":The Black Death";
        } else if (year>=1665 && year<=1666){
           pandemic=": Great Plague of London";

        }else if (year>=1770 && year<=1772){
            pandemic=": Russian plague";
        }else if (year>=1889 && year<=1890){
            pandemic=": Flu pandemic";
        }else if (year==1916){
            pandemic=": American polio epidemic";
        }else if (year>=1918 && year<=1920){
            pandemic=": Spanish flue";
        }else if(year>=2009 && year<=2010 ){
            pandemic=(": H1N1 swine flue pandemic");
        }else if (year>2013 && year <2017){
            pandemic=": West African Ebola pandemic";
        }else if (year>2019 && year<2022){
            pandemic=": COVID-19";
        }else {
            pandemic=":No pandemic ,yuhu";
        }
        System.out.println(year+""+pandemic);
    }
}
