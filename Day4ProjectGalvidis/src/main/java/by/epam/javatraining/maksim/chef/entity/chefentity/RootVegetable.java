package by.epam.javatraining.maksim.chef.entity.chefentity;

import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.Calculate;

public class RootVegetable extends Vegetable{

    private RootType defineRootType;
    private double calories;

    public RootVegetable(double weight, RootType defineRootType){
        super(weight);
        this.defineRootType = defineRootType;
        this.calories = Calculate.rootCalories(weight, defineRootType);
    }

    @Override
    public VegetableType defineVegetableType() {
        return VegetableType.ROOT_VEGETABLE;
    }

    @Override
    public String toString(){
        return super.toString() + " " + defineRootType + " calories = " + calories + "]";
    }

    public RootType getDefineRootType() {
        return defineRootType;
    }

    public void setDefineRootType(){
        this.defineRootType = defineRootType;
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
        RootVegetable other = (RootVegetable) obj;
        if(calories != other.calories || defineRootType != other.defineRootType){
            return false;
        }
        return true;
    }
}
