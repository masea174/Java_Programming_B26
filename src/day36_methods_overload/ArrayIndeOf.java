package day36_methods;

public class ArrayIndeOf {
    public static int indexOf(int[]a,int element){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==element ){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8};
        System.out.println(indexOf(a, 5));
        System.out.println(indexOf(a,20));
        System.out.println(indexOf(a,2));
        String []  str={"one","two","tree"};
        System.out.println(indexOf(str,"one"));
        System.out.println(indexOf(str, "th"));
    }
        public static int indexOf(String[]a,String element){
            for (int i = 0; i < a.length; i++) {
                if(a[i].equals(element )){
                    return i;
                }
            }return -1;
        }
}
