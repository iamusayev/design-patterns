package az.design.patterns.creational.abstractfactory.website;

import az.design.patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests code...");
    }
}
