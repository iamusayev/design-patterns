package az.design.patterns.strategy;


import lombok.Setter;

public class Developer {

    @Setter
    private Activity activity;

    public void doSomething() {
        activity.justDoIt();
    }
}
