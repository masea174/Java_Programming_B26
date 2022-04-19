package day29_array;

public class Initials {
    public static void main(String[] args) {
        String[] fullName={"James Bond","Eve Rell","Anna Johnson", "Willie Orange"};
        String initials="";
        for(String name:fullName){
            initials+=""+name.charAt(0)+name.charAt(name.indexOf(" ")+1)+" ";
        }
        System.out.println(initials);
    }

}
