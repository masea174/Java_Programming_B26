package day46_static;

import java.util.Arrays;

public class CydeoStudent {
   public String name;
    public int groupNumber;
    public static  int batchNumber;
    public static String[] instroctors;
    public static  String schoolName;
// you can declare in the same time but is not recomended it will use the static block.
static {
        batchNumber=26;
        instroctors=new String[]{"Nadir","Mehmet","Aysun","Austin","Saim"};
        schoolName="Cydeo";
}

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public  static void printInfo(){
    System.out.println("Batch number "+batchNumber);
    System.out.println("School name "+schoolName);
    System.out.println("Instructors "+ Arrays.toString(instroctors));

}

}
