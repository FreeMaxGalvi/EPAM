package by.epam.javatraining.maksim.chef.chefentity;

import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.Calculate;

public class FruitVegetable extends Vegetable {

    private FruitType searchFruitType;
    private double calories;

    public FruitVegetable(double weight, FruitType searchFruitType){
        super(weight);
        this.searchFruitType = searchFruitType;
        this.calories = Calculate.fruitCalories(weight, searchFruitType);
    }

    @Override
    public VegetableType searchVegetableType() {
        return VegetableType.FRUIT_VEGETABLE;
    }

    @Override
    public String toString(){
        return super.toString() +" calories = " + calories + " ]";
    }

    public FruitType getSearchFruitType() {
        return searchFruitType;
    }

    public void setSearchFruitType(){
        this.searchFruitType = searchFruitType;
    }

    @Override
    public int hashCode() {
        final int prime = 13;
        int result = super.hashCode();
        result = prime * result + (int)(calories * 1000);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!super.equals(obj) || getClass() != obj.getClass()){
            return false;
        }
        FruitVegetable other = (FruitVegetable) obj;
        if(calories != other.calories || searchFruitType != other.searchFruitType){
            return false;
        }
        return true;
    }
}
