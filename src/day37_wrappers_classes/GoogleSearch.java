package day37_wrappers_classes;

public class GoogleSearch {
    public static void main(String[] args) {
        String result="About 25,000,000 results (1.00 seconds) ";
        String []arr=result.split(" ");

        String reusltStr=arr[1].replace(",","");
        String timeStr=arr[3].substring(1);

        System.out.println("timeStr = " + timeStr);
        System.out.println("reusltStr = " + reusltStr);
        System.out.println(Integer.MAX_VALUE);
        long resultNumber=Long.parseLong(reusltStr);
        double timeNumber=Double.parseDouble(timeStr);

        if(resultNumber >=0){
            System.out.println(" Test case passed-Possitive number");
        }
        if (timeNumber<=2&& timeNumber>=0){
            System.out.println("TEST CASE PASSED UNDER 2 SECONDS" );
        }
    }
}
