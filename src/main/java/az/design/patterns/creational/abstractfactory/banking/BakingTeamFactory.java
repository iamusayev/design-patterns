package az.design.patterns.creational.abstractfactory.banking;

import az.design.patterns.abstractfactory.Developer;
import az.design.patterns.creational.abstractfactory.ProjectManager;
import az.design.patterns.creational.abstractfactory.ProjectTeamFactory;
import az.design.patterns.creational.abstractfactory.Tester;

public class BakingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
