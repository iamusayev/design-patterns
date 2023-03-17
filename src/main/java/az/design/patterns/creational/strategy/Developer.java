package az.design.patterns.creational.strategy;


import lombok.Setter;

public class Developer {

    @Setter
    private Activity activity;

    public void doSomething() {
        activity.justDoIt();
    }
}
