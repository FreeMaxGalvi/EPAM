package by.epam.javatraining.maksim.chef.runner;

import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.utils.SaladLogic;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Salad salad = new Salad("[Summer salad]");
        try {
            Salad.cutSalad(new File("src\\main\\java\\by\\epam\\javatraining\\maksim\\chef\\vegetables.txt"), salad);
        }
        catch (FileNotFoundException e){
            System.out.println("Incorrect file path.");
        }

        SaladLogic logic = new SaladLogic();
        logic.findSaladCalories(salad.getVegetable());
        logic.findTotalWeight(salad.getVegetable());
        logic.sortVegetablesByCalories(salad.getVegetable());
        logic.sortVegetablesByWeight(salad.getVegetable());
        logic.findFitVegetables(salad.getVegetable(), 0, 10);
    }
}
