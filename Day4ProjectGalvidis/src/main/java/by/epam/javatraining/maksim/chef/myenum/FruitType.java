package by.epam.javatraining.maksim.chef.myenum;

public enum FruitType {

    CORN ("Corn"),
    CUCUMBER ("Cucumber"),
    PEPPER ("Pepper"),
    TOMATO ("Tomato");
    private String title;


    FruitType(String title) {
        this.title = title;
    }
}
