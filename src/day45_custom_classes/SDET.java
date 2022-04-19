package day45_custom_classes;

public class SDET {
    /*
    Write a function and find a match that takes two arguments  A and B which are arrays with the same number of numbers. Consider each element in A and its corresponding element in B. The function returns the count of the number of times that the two numbers differ by 5 or less but are not equal to each other -please consider edge cases when providing the answer.



findMatch([1, 2, 3], [100, 4, 200]) = 1

findMatch([1, 2, 3], [100, 4, 3]) = 1

findMatch([1, 2, 3], [-1, 7, 5]) = 3
any idea?
     */
    public static int findAMatch(int [] a,int []b){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if(Math.abs(a[i]-b[i])<=5 && a[i]!=b[i]){
                count++;
            }
        }return count ;

    }

    public static void main(String[] args) {
        int[]a={1, 2, 3}; int []b={-1, 7, 5};
        System.out.println(findAMatch(a,b));
    }

    public static class Offer {
        String location;
        String company;
        double salary;
        boolean isFullTime;
        int numberOfPTOs;

        public Offer(String location, String company) {
            this.location = location;
            this.company = company;
        }

        public Offer(String location, String company, double salary) {
            this.location = location;
            this.company = company;
            this.salary = salary;
        }

        public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTOs) {
            this.location = location;
            this.company = company;
            this.salary = salary;
            this.isFullTime = isFullTime;
            this.numberOfPTOs = numberOfPTOs;
        }

        @Override
        public String toString() {
            String str="Offer " + "~location=" + location +
                    "~ company=" + company ;
               str+="~"+(salary>0?salary+"$":"");
               str+= "~"+(isFullTime?"Fulltime":"Contract");
               str+="~"+(numberOfPTOs>0?numberOfPTOs+ " off days":"");
                           return str;
        }
    }
}
