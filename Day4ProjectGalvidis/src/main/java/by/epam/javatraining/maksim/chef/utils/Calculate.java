package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;

public class Calculate {
    public static double fruitCalories(double weight, FruitType searchFruitType){

        double cal = weight;
        switch (searchFruitType){
            case CORN:
                cal *= 123;
                break;
            case PEPPER:
                cal *= 27;
                break;
            case TOMATO:
                cal *= 20;
                break;
            case CUCUMBER:
                cal *= 13.5;
                break;
        }

        return cal;
    }

    public static double rootCalories(double weight, RootType searchFruitType){

        double cal = weight;
        switch (searchFruitType){
            case BEET:
                cal *= 43;
                break;
            case CARROT:
                cal *= 32;
                break;
            case POTATO:
                cal *= 77;
                break;
            case RADISH:
                cal *= 19;
                break;
        }

        return cal;
    }

    public static double leafCalories(double weight, LeafType searchFruitType){

        double cal = weight;
        switch (searchFruitType){
            case CABBAGE:
                cal *= 25;
                break;
            case CELERY:
            case LETTUCE:
                cal *= 15;
                break;
            case SPINACH:
                cal *= 22;
                break;
        }

        return cal;
    }
}
