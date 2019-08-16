package by.epam.javatraining.maksim.chef.myInterfaces;

import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.myexception.SaladException;
import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;

/**
 * This is interface IDataLoader.
 * 
 * @author Vitaly Kononov
 * @since 08-08-2019
 * @version 1.0
 */
public interface IDataLoader {

	String[] VEGETABLE_HEADERS = { "Type", "Name", "Weight", "Calories" };

	String FRUIT_VEGETABLE = "FruitVegetable";
	String LEAF_VEGETABLE = "LeafVegetable";
	String ROOT_VEGETABLE = "RootVegetable";

	void loadSaladData(Salad salad) throws SaladException;


}
