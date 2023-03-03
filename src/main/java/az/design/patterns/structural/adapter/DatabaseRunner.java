package az.design.patterns.structural.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}