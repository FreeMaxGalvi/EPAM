package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.entity.chefentity.Vegetable;
import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladLogic {

    final static Logger logger = Logger.getLogger(SaladLogic.class);


    public double findSaladCalories(List<Vegetable> listOfVegetables) {
        double totalCalories = 0;
        for (int item = 0; item < listOfVegetables.size(); item++) {
            totalCalories += listOfVegetables.get(item).getCalories();
        }
        logger.info("Total calories: " + totalCalories);
        return totalCalories;
    }

    public double findTotalWeight(List<Vegetable> listOfVegetables) {
        double totalWeight = 0;
        for (int item = 0; item < listOfVegetables.size(); item++) {
            totalWeight += listOfVegetables.get(item).getWeight();
        }
        logger.info("Total weight: " + totalWeight);
        return totalWeight;
    }

    public List<Vegetable> sortVegetablesByCalories(List<Vegetable> listOfVegetables) {
        listOfVegetables.sort(Comparator.comparing(Vegetable::getCalories).reversed());
        logger.info("Vegetables sorted by calories: " + listOfVegetables);
        return listOfVegetables;
    }

    public List<Vegetable> sortVegetablesByWeight(List<Vegetable> listOfVegetables) {
        listOfVegetables.sort(Comparator.comparing(Vegetable::getWeight).reversed());
        logger.info("Vegetables sorted by weight: " + listOfVegetables);
        return listOfVegetables;
    }

    public List<Vegetable> findFitVegetables(List<Vegetable> listOfVegetables, int begin, int end) {

        List<Vegetable> bestVegetables = new ArrayList<>();


        for (int item = 0; item < listOfVegetables.size(); item++) {
            if (listOfVegetables.get(item).getCalories() < end && listOfVegetables.get(item).getCalories() > begin) {
                bestVegetables.add(listOfVegetables.get(item));
            }
        }
        logger.info("Fit vegetables are: " + bestVegetables);
        return bestVegetables;
    }
}
