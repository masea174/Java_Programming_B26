package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String , ArrayList<String >>countries=new HashMap<>();
        countries.put("U.S.A.",new ArrayList<>(Arrays.asList("New York","Chicago","DC","LA","Dallas")));
        countries.put("Turkey",new ArrayList<>(Arrays.asList("Istambul","Ankara","Izmir")));
        countries.put("Canada",new ArrayList<>(Arrays.asList("Quebec","Toronto","Vancuver")));

        System.out.println(countries);

        //prints all the cities that starts with d or I

        for(ArrayList <String> cities:countries.values()){
            for (String city:cities){
                if (city.startsWith("D")||city.startsWith("I")){
                    System.out.println(city);
            }


            }
        }

        //what country do you want to tour?

        System.out.println();
        System.out.println("what country do you want to tour?");
        Scanner input =new Scanner(System.in);
        String country=input.nextLine();

        for(String cities:countries.get(country))
            System.out.println("Touring ...."+cities);

    }
}
