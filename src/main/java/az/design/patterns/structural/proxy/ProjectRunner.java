package az.design.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("github.com/iamusayev/real-project");
        project.run();
    }
}
