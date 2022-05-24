package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {

        Map <Integer,Student> map=new HashMap<>();

        map.put(1,new Student("James",4.0,7));
        map.put(2,new Student("Hanna",3.9,10));
        map.put(3,new Student("Diana",4.4,12));
        map.put(4,new Student("Jehad",3.6,29));
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println();
        System.out.println(map.keySet());
//looping thru the map
        for(Integer keys:map.keySet()){

            System.out.println("Rank is : "+keys);
            System.out.println(map.get(keys));
            System.out.println();
        }

        for (Student student:map.values()){
            if(student.id<=10){
                System.out.println(student.name);
            }
        }
        for(Map.Entry<Integer,Student>entry:map.entrySet()){
            System.out.println("Rank: "+entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

    }

}
