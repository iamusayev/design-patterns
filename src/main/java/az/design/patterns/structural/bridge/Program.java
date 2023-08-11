package az.design.patterns.structural.bridge;

public abstract class Program {

    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}