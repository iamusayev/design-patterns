package az.design.patterns.abstractfactory.banking;

import az.design.patterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
