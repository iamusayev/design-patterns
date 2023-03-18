package az.design.patterns.creational.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("sleeping...");
    }
}
