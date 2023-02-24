package az.design.patterns.abstractfactory.banking;

import az.design.patterns.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
