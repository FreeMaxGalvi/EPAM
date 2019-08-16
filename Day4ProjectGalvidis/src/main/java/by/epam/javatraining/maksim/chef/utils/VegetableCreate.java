package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.entity.chefentity.FruitVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.LeafVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.RootVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.Vegetable;
import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.myexception.VegetableException;

public class VegetableCreate {

    public Vegetable createVegetable(String name, VegetableType vegetableType, double weight)
            throws VegetableException {

        Vegetable vegetable = null;

        switch (vegetableType) {

            case FRUIT_VEGETABLE:
                if (weight > 0) {
                    try {
                        vegetable = new FruitVegetable(weight, FruitType.valueOf(name));
                    } catch (IllegalArgumentException e){
                        System.out.println("Wrong name of vegetable, now use CORN");
                        vegetable = new FruitVegetable(weight, FruitType.CORN);
                    }
                }
                break;

            case LEAF_VEGETABLE:
                if (weight > 0) {
                    try {
                        vegetable = new LeafVegetable(weight, LeafType.valueOf(name));
                    } catch (IllegalArgumentException e){
                        System.out.println("Wrong name of vegetable, now use CABBAGE");
                        vegetable = new LeafVegetable(weight, LeafType.CABBAGE);
                    }
                }
                break;

            case ROOT_VEGETABLE:
                if (weight > 0) {
                    try {
                        vegetable = new RootVegetable(weight, RootType.valueOf(name));
                    } catch (IllegalArgumentException e){
                        System.out.println("Wrong name of vegetable, now use BEET");
                        vegetable = new RootVegetable(weight, RootType.BEET);
                    }
                }
                break;
        }
        if (isVegi(vegetable)) {
            throw new VegetableException(" failed check, bad or negative parameters");
        }
        return vegetable;
    }

    public boolean isVegi(Vegetable vegetable) {
        if (vegetable != null && vegetable.getWeight() > 0) {
            return false;
        }
        return true;
    }
}
