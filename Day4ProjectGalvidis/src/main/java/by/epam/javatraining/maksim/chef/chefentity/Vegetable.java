package by.epam.javatraining.maksim.chef.chefentity;

import by.epam.javatraining.maksim.chef.myenum.VegetableType;

public abstract class Vegetable {
    private double weight;

    public Vegetable(double weight){
        this.weight = weight;
    }

    public Vegetable(){

    }

    public abstract VegetableType searchVegetableType();

    @Override
    public String toString(){
        return "[weight = " + weight + " " + searchVegetableType();
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public int hashCode(){
        final int prime = 13;
        int result = 1;
        result = prime * result + (int)(weight * 1000);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass()!= obj.getClass()){
            return false;
        }
        Vegetable other = (Vegetable) obj;
        if(weight != other.weight){
            return false;
        }
        return true;
    }
}
