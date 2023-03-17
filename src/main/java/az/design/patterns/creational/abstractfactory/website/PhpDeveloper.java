package az.design.patterns.creational.abstractfactory.website;

import az.design.patterns.abstractfactory.Developer;

public class PhpDeveloper  implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code...");
    }
}
