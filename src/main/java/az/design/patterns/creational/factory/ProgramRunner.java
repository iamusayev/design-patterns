package az.design.patterns.creational.factory;

public class ProgramRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty(ProgrammingLanguage.PHP);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case JAVA -> new JavaDeveloperFactory();
            case CPP -> new CppDeveloperFactory();
            case PHP -> new PhpDeveloperFactory();
            default -> throw new RuntimeException();
        };
    }
}