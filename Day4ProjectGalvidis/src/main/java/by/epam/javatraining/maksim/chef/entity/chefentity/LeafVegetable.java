package by.epam.javatraining.maksim.chef.entity.chefentity;

import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.Calculate;

public class LeafVegetable extends Vegetable{

    private LeafType defineLeafType;
    private double calories;

    public LeafVegetable(double weight, LeafType defineLeafType){
        super(weight);
        this.defineLeafType = defineLeafType;
        this.calories = Calculate.leafCalories(weight, defineLeafType);
    }

    @Override
    public VegetableType defineVegetableType() {
        return VegetableType.LEAF_VEGETABLE;
    }

    @Override
    public String toString(){
        return super.toString() + " " + defineLeafType + " calories = " + calories + "]";
    }

    public LeafType getDefineLeafType() {
        return defineLeafType;
    }

    public void setDefineLeafType(){
        this.defineLeafType = defineLeafType;
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
        LeafVegetable other = (LeafVegetable) obj;
        if(calories != other.calories || defineLeafType != other.defineLeafType){
            return false;
        }
        return true;
    }
}
