package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;

public class ValidateSalad {
    private ValidateSalad(){}

    public static boolean isSalad(String type, String vegetableType, double weight){

        boolean isData = true;

        if(weight < 0){
            System.out.println("Weight should be more than 0.");
            isData = false;
        }

        try{
            VegetableType.valueOf(type);
        }
        catch (Exception e){
            System.out.println("Incorrect type.");
            isData = false;
        }

        try {
            switch (VegetableType.valueOf(type)){
                case FRUIT_VEGETABLE:
                    FruitType.valueOf(vegetableType);
                    break;
                case LEAF_VEGETABLE:
                    LeafType.valueOf(vegetableType);
                    break;
                case ROOT_VEGETABLE:
                    RootType.valueOf(vegetableType);
                    break;
                default:
                    break;
            }
        } catch (Exception e){
            System.out.println("Incorrect vegetableType.");
            isData = false;
        }

        finally {
            if (!isData)
                System.out.println("Enter parameters again.");
            return isData;
        }
    }
}
