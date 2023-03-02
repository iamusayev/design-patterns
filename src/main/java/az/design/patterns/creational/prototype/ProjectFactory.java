package az.design.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class ProjectFactory {

    Project project;

    public Project cloneProject() {
        return (Project) project.copy();
    }

}
