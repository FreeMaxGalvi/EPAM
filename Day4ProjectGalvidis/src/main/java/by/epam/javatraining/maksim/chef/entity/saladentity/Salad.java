package by.epam.javatraining.maksim.chef.entity.saladentity;

import by.epam.javatraining.maksim.chef.entity.chefentity.Vegetable;
import by.epam.javatraining.maksim.chef.utils.DataLoader;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private String nameSalad;

    public Salad(String nameSalad){
        this.nameSalad = nameSalad;
    }

    private List<Vegetable> listOfVegetables = new ArrayList<Vegetable>();

    public void addVegetable(Vegetable addVegetable){
        listOfVegetables.add(addVegetable);
    }

    public List<Vegetable> getVegetable(){
        return listOfVegetables;
    }

    public void setVegetable(ArrayList<Vegetable> vegetable){
        this.listOfVegetables = vegetable;
    }

    public void setVegetable(List<Vegetable> vegetable){
        this.listOfVegetables = (ArrayList<Vegetable>) vegetable;
    }

    public String getNameSalad(){
        return nameSalad;
    }

    public void setNameSalad(String nameSalad){
        this.nameSalad = nameSalad;
    }

    public void cutSalad(Salad salad) {

        DataLoader dataLoader = new DataLoader();
        dataLoader.loadSaladData(salad);
    }

    @Override
    public String toString(){
        return "[name = " + nameSalad + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 13;
        int result = 1;
        result = prime * result + ((nameSalad == null) ? 0 : nameSalad.hashCode());
        result = prime * result + ((listOfVegetables == null) ? 0 : listOfVegetables.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Salad other = (Salad) obj;
        if((nameSalad == null && other.nameSalad != null) || !nameSalad.equals(other.nameSalad)){
            return false;
        }
        if(listOfVegetables == null && other.listOfVegetables != null){
            return false;
        } else if (!listOfVegetables.equals(other.listOfVegetables)){
            return false;
        }
        return true;
    }
}
