package day54_abstractions.animal;

import day54_abstractions.language.Language;

public final class Parrot extends Birds implements Flyable, Language {
    @Override
    public void eat() {
        System.out.println("Parrot wobble over the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Hello Hello");
    }

    @Override
    public void bye() {
        System.out.println("Buy Buy");
    }
}
