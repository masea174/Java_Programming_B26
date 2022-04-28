package day51_ihneritance.lyft;

public class LyftXL extends Lyft{
    public LyftXL(String name,int miles){
        super(name,miles);
    }
    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles)*1.1;
    }
}
