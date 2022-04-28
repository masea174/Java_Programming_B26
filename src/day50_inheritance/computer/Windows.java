package day50_inheritance.computer;

public class Windows extends Computer{

    public Windows( int memory){
        super("Windows",memory); // calls the parent constructor witch sets the os varible "Windows "aand sets the memory  variable that will be argument for windows constructor

    }
}
