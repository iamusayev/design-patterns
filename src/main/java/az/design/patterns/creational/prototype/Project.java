package az.design.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Project implements Copyable {

    private int id;
    private String projectName;
    private String source;

    @Override
    public Object copy() {
        return new Project(id, projectName, source);
    }


}
