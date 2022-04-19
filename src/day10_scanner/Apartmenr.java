package day10_scanner;
import java.util.Scanner;
public class Apartmenr {
    /*
     Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
     */
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       System.out.println("please enter the address: ");
       String address= input.nextLine();
       System.out.println("enter the owners name");
       String nameOwner= input.nextLine();
       System.out.println("enter the number of units");
       int numberOfUnits= input.nextInt();
       System.out.println("enter the average size of the apartments");
       double averageSizeUnit= input.nextDouble();
       System.out.println("Enter the monthly rent amount:");
       double rent= input.nextDouble();
       System.out.println("enter the number of washers and Dryers");
       int washerDryers= input.nextInt();
       System.out.println(" are the pets aloud?");
       boolean allowedPets= input.nextBoolean();
       System.out.println("does it have a pool?");
       boolean hasPool= input.nextBoolean();
       System.out.println("whats the leng of the lease?" );
       int lenghOfLease=input.nextInt();
       System.out.println("total residents number: ");
       int totalresidents= input.nextInt();

       System.out.println("owners phone number:");
       String ownerPhone= input.next();
       System.out.println("does it has a gas station near by?");
       boolean gasStationNearBy= input.nextBoolean();
       System.out.println("how many floors has the building");
       int numberOfFloors= input.nextInt();
       System.out.println("does it has a basement:");
       boolean hasBasement= input.nextBoolean();
       System.out.println("does has any available units");
       boolean hasAvailableUnits= input.nextBoolean();
       System.out.println("Does it have an AC:");
       boolean hasAirConditioner= input.nextBoolean();
       System.out.println("how many parking spaces it has ");
       int parkingSpacenumber= input.nextInt();
       System.out.println("does it have a well chair access");
       boolean hasWeelchairacces= input.nextBoolean();
       System.out.println("How many stars it has ?" );
       int review = input.nextInt();

       double after3Years= rent*0.90;
       double after6Years= rent*0.80;
       double averageNumberresidentsPerUnit=totalresidents/numberOfUnits;
       double averageParkingPerUnit=parkingSpacenumber/numberOfUnits;
       double averageNumberOfUnitsPerFloor=numberOfUnits/numberOfFloors;

       System.out.println("after3Years = " + after3Years);
       System.out.println("after6Years = " + after6Years);
       System.out.println("averageNumberresidentsPerUnit = " + averageNumberresidentsPerUnit);
       System.out.println("averageParkingPerUnit = " + averageParkingPerUnit);
       System.out.println("averageNumberOfUnitsPerFloor = " + averageNumberOfUnitsPerFloor);








    }
}
