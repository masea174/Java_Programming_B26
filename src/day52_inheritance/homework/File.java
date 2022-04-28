package day52_inheritance.homework;

public class File {
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
    public void openFile(){
        System.out.println("Opening "+name);
    }
}
class UsingFile{
    public static void main(String[] args) {
        File file=new File("Java file ",6);
        System.out.println(file);
        file.openFile();
    }
}