package by.epam.javatraining.maksim.chef.runner;

import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.utils.SaladLogic;

public class Main {
    public static void main(String[] args) {

        Salad salad = new Salad("[Summer salad]");
        salad.cutSalad(salad);

        SaladLogic logic = new SaladLogic();
        logic.findSaladCalories(salad.getVegetable());
        logic.findTotalWeight(salad.getVegetable());
        logic.sortVegetablesByCalories(salad.getVegetable());
        logic.sortVegetablesByWeight(salad.getVegetable());
        logic.findFitVegetables(salad.getVegetable(), 2, 45);
    }
}
