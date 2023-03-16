package az.design.patterns.creational.abstractfactory;

import az.design.patterns.creational.abstractfactory.banking.BakingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BakingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();


        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
