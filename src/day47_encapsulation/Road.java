package day47_encapsulation;

public class Road {
    public static void main(String[] args) {
        TraficLights lights=new TraficLights("red");
        System.out.println(lights.getColor());
        TraficLights lights2= new TraficLights("green");
        lights2.setColor("grey");
        System.out.println(lights2.getColor());

        TraficLights lights3 =new TraficLights("Black");
        System.out.println(lights3.getColor());

    }
}
