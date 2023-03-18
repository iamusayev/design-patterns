package az.design.patterns.creational.abstractfactory.banking;

import az.design.patterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
