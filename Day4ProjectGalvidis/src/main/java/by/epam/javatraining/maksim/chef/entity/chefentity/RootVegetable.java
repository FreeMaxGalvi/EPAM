package by.epam.javatraining.maksim.chef.entity.chefentity;

import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.Calculate;

public class RootVegetable extends Vegetable{

    private RootType searchRootType;
    private double calories;

    public RootVegetable(double weight, RootType searchRootType){
        super(weight);
        this.searchRootType = searchRootType;
        this.calories = Calculate.rootCalories(weight, searchRootType);
    }

    @Override
    public VegetableType searchVegetableType() {
        return VegetableType.ROOT_VEGETABLE;
    }

    @Override
    public String toString(){
        return super.toString() +" calories = " + calories + "]";
    }

    public RootType getSearchRootType() {
        return searchRootType;
    }

    public void setSearchRootType(){
        this.searchRootType = searchRootType;
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
        if(calories != other.calories || searchRootType != other.searchRootType){
            return false;
        }
        return true;
    }
}
