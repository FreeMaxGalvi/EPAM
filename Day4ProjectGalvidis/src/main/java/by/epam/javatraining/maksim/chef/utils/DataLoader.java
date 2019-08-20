package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.entity.chefentity.FruitVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.LeafVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.RootVegetable;
import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.myInterfaces.IDataLoader;
import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class DataLoader implements IDataLoader {
    private static Logger logger = Logger.getLogger(DataLoader.class);

    @Override
    public  void loadSaladData(File file, Salad salad) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String type;
        String vegetableType;
        double weight;
        while (sc.hasNext()){
            type = sc.next();
            vegetableType = sc.next();
            weight = sc.nextDouble();
            if (ValidateSalad.isSalad(type, vegetableType, weight)){
                switch (VegetableType.valueOf(type)){
                    case FRUIT_VEGETABLE:
                        Salad.addVegetable(new FruitVegetable(weight, FruitType.valueOf(vegetableType)));
                        break;
                    case LEAF_VEGETABLE:
                        Salad.addVegetable(new LeafVegetable(weight, LeafType.valueOf(vegetableType)));
                        break;
                    case ROOT_VEGETABLE:
                        Salad.addVegetable(new RootVegetable(weight, RootType.valueOf(vegetableType)));
                        break;
                    default:
                        logger.info("Incorrect type.");
                        break;
                }
            }
        }
    }
}
