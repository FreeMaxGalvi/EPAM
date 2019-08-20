package by.epam.javatraining.maksim.chef.myenum;

public enum RootType {

    BEET ("Beet"),
    CARROT ("Carrot"),
    POTATO ("Potato"),
    RADISH ("Radish");
    private String title;


    RootType(String title) {
        this.title = title;
    }
}
