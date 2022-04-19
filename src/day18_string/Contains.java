package day18_string;

public class Contains {
    public static void main(String[] args) {
        String day="Today it is above 70";
        System.out.println(day.contains("it is"));
        System.out.println(day.contains("itis"));
        System.out.println(day.contains("ay it"));
        System.out.println(day.contains("7"));
        System.out.println(day.contains("today"));//Today is uppercase
        System.out.println(day.contains("Ti7"));//checks for the sequence,not only for characters;

    }
}
