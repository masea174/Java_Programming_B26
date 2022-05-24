package day58_exeptions;

public class PesronObject {
    public static void main(String[] args) throws Exception{
        Person obj =new Person();
        obj.setAge(50);
            obj.setName(null);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
