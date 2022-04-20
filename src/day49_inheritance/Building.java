package day49_inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj=new Person();
        obj.name="James Bond";
        obj.age=40;
        obj.favouriteHobby="spy stuff";
        obj.talk();

        StudentClass obj2=new StudentClass();
        obj2.name="Jorge";
        obj2.age=10;
        obj2.favouriteHobby="Drawing";
        obj2.talk();

        obj2.stressLevel=89;
        obj2.study();

    }
}
