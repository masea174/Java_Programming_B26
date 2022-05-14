package day55_polymorphism.shopping;

public class Salary {
    public static void main(String[] args) {
        boolean isPersonMarried=true;
        double salary=129999;
        double netSalary=0;
        if(isPersonMarried && salary>130000){
                netSalary=salary-(35-5)*salary/100;
        }else if(isPersonMarried && salary<130000&& salary>100000){
            netSalary=salary-(30-5)*salary/100;
        }else if(isPersonMarried && salary<99000&& salary>80000) {
            netSalary = salary - (25 - 5) * salary / 100;
        }else if(isPersonMarried && salary<79000) {
            netSalary = salary - (20 - 5) * salary / 100;
        }else if(!isPersonMarried && salary>130000){
            netSalary=salary-35*salary/100;
        }else if(!isPersonMarried && salary<129000&& salary>100000){
            netSalary=salary-30*salary/100;
        }else if(!isPersonMarried && salary<99000&& salary>80000) {
            netSalary = salary - 25  * salary / 100;
        }else if(!isPersonMarried && salary<79000) {
            netSalary = salary - 20 * salary / 100;
        }
        System.out.println(netSalary);
    }}

