package az.design.patterns.structural.bridge;


public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new StockExchange(new CppDeveloper()),
                new BankSystem(new JavaDeveloper())
        };
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
