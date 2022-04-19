package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {
        ArrayList<String> allJobs=new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET","developer","dev op","PO","CEO","QA","BA","Chef", "Doctor", "Police Officer","PO"));
        System.out.println(allJobs);
        ArrayList<String> jobs1=new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO","QA","BA"));
        System.out.println(jobs1);
        ArrayList<String> jobs2=new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("developer","PO","SDET","dev op"));
        System.out.println(jobs2);
        ArrayList<String> jobs3=new ArrayList<>(allJobs);

        System.out.println(jobs3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor","nurse")));

    }
}
