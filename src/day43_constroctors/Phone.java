package day43_constroctors;

import day24_loops.BranchingExample;

public class Phone {
    /*
    make a phone class
    name , brand , storage, version
    2 or 3 constractors that initialize values
    -initialize the name
    - name brand ,memory and version
    -toString method
     */

    String  name;
    String brand;
    int storage;
    double version;

    public Phone(String name){
        this.name=name;
    }
    public Phone (String brand,String name,double version){
        this.brand=brand;
     this.name=name;
        this.version=version;

    }
    public Phone(String name,String brand,int storage,double version){
        this.name=name;
        this.brand=brand;
        this.storage=storage;
        this.version=version;
    }
    public String toString(){
        String obj= "We have the "+name;
        if(brand!=null){
            obj+=" of "+ brand;
        }if(storage>0){
            obj+=" with "+storage+" gb";
        }if(version!=0.0){
            obj+=" and software version is "+version;
        }return obj;
    }
}
