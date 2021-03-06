package by.epam.javatraining.maksim.chef.entity.chefentity;

import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.Calculate;

public class FruitVegetable extends Vegetable {

    private FruitType defineFruitType;
    private double calories;

    public FruitVegetable(double weight, FruitType defineFruitType){
        super(weight);
        this.defineFruitType = defineFruitType;
        this.calories = Calculate.fruitCalories(weight, defineFruitType);
    }

    @Override
    public VegetableType defineVegetableType() {
        return VegetableType.FRUIT_VEGETABLE;
    }

    @Override
    public String toString(){
        return super.toString() + " " + defineFruitType + " calories = " + calories + "]";
    }

    public FruitType getDefineFruitType() {
        return defineFruitType;
    }

    public void setDefineFruitType(){
        this.defineFruitType = defineFruitType;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(){
        this.calories = calories;
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
        if(calories != other.calories || defineFruitType != other.defineFruitType){
            return false;
        }
        return true;
    }
}
