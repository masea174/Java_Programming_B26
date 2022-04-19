package day34_return_methods;

public class MethodWithOthers {
    public static String dayInWords(int i){
//        String strDay="";
//        switch (i){
//            case 1:
//                strDay= "Monday";
//                break;
//            case 2:
//                strDay="Tusday";
//                break;
//            case 3:
//                strDay="Wendnesday";
//                break;
//            case 4:
//                strDay="Thursday";
//                break;
//            case 5:
//                strDay="Friday";
//                break;
//            case 6:
//                strDay="Saturday";
//                break;
//            case 7:
//                strDay="Sunday";
//                break;
//            default:
//                strDay="Invalid";
//        }return strDay;

        switch (i){
            case 1:
                return  "Monday";
            case 2:
                return"Tusday";
            case 3:
                return"Wendnesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }public static int firstEvenNumber(int []nums){
        for (int each:nums){
            if(each%2==0){
                return each;
            }
        }return  0;

    }

    public static void main(String[] args) {
        int []a={5,1,4,5,6,12};
        System.out.println(firstEvenNumber(a));
    }
}
