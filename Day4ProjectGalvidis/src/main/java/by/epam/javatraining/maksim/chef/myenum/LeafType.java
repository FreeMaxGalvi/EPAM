package by.epam.javatraining.maksim.chef.myenum;

public enum LeafType {

    CABBAGE ("Cabbage"),
    CELERY ("Celery"),
    LETTUCE ("Lettuce"),
    SPINACH ("Spinach");
    private String title;


    LeafType(String title) {
        this.title = title;
    }
}
