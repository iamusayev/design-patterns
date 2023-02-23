package az.design.patterns.abstractfactory.website;

import az.design.patterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests code...");
    }
}
