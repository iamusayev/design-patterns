package az.design.patterns.creational.strategy;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Reading());
        developer.doSomething();
    }
}
