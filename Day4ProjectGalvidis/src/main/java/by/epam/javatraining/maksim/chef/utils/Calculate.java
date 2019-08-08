package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;

public class Calculate {
    public static double fruitCalories(double weight, FruitType searchFruitType){

        double cal = 0;
        switch (searchFruitType){
            case CORN:
                cal = weight * 123;
                break;
            case PEPPER:
                cal = weight * 27;
                break;
            case TOMATO:
                cal = weight * 20;
                break;
            case CUCUMBER:
                cal = weight * 13.5;
                break;
        }

        return cal;
    }

    public static double rootCalories(double weight, RootType searchFruitType){

        double cal = 0;
        switch (searchFruitType){
            case BEET:
                cal = weight * 43;
                break;
            case CARROT:
                cal = weight * 32;
                break;
            case POTATO:
                cal = weight * 77;
                break;
            case RADISH:
                cal = weight * 19;
                break;
        }

        return cal;
    }

    public static double leafCalories(double weight, LeafType searchFruitType){

        double cal = 0;
        switch (searchFruitType){
            case CABBAGE:
                cal = weight * 25;
                break;
            case CELERY:
            case LETTUCE:
                cal = weight * 15;
                break;
            case SPINACH:
                cal = weight * 22;
                break;
        }

        return cal;
    }
}
