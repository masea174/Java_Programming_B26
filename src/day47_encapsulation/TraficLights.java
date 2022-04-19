package day47_encapsulation;

import java.util.Locale;

public class TraficLights {
    private String color;
    public TraficLights(String color){
       setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()){
            case "red":
            case "yellow":
            case"green":
        this.color = color;
    }}
}
