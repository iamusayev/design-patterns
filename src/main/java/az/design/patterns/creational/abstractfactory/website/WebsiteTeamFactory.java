package az.design.patterns.creational.abstractfactory.website;

import az.design.patterns.abstractfactory.Developer;
import az.design.patterns.creational.abstractfactory.ProjectManager;
import az.design.patterns.creational.abstractfactory.ProjectTeamFactory;
import az.design.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
