package cheff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import by.epam.javatraining.maksim.chef.entity.chefentity.FruitVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.LeafVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.RootVegetable;
import by.epam.javatraining.maksim.chef.entity.chefentity.Vegetable;
import by.epam.javatraining.maksim.chef.myenum.FruitType;
import by.epam.javatraining.maksim.chef.myenum.LeafType;
import by.epam.javatraining.maksim.chef.myenum.RootType;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.utils.SaladLogic;
import by.epam.javatraining.maksim.chef.utils.VegetableCreate;
import by.epam.javatraining.maksim.chef.myexception.VegetableException;
import org.junit.jupiter.api.Test;



/**
 * 
 * This is the UnitTest class; it's created for passing Unit test.
 * 
 * @author Maksim Halvidzis
 * @since 20-08-2019
 * @version 2.0
 */
class UnitTest {

	private SaladLogic sLogic = new SaladLogic();
	private VegetableCreate vCreate = new VegetableCreate();

	List<Vegetable> actual = new ArrayList<Vegetable>();

    Vegetable vegetable1 = new FruitVegetable(0.4, FruitType.CUCUMBER);
    Vegetable vegetable2 = new LeafVegetable(0.6, LeafType.CELERY);
    Vegetable vegetable3 = new RootVegetable(0.7, RootType.CARROT);

	{
		actual.add(vegetable1);
		actual.add(vegetable2);
		actual.add(vegetable3);
	}

	/**
	 * @see SaladLogic#findSaladCalories(List)
	 */
	@Test
	void findSaladCalories() {

		assertEquals(36.8, sLogic.findSaladCalories(actual));
	}

	/**
	 * @see SaladLogic#findTotalWeight(List)
	 */
	@Test
	void findTotalWeightLift() {

		assertEquals(1.7, sLogic.findTotalWeight(actual));
	}

	/**
	 * @see SaladLogic#findFitVegetables(List, int, int)
	 */
	@Test
	void findFitVegetables() {

		assertEquals(vegetable2, sLogic.findFitVegetables(actual, 8, 10));
	}

	/**
	 * @throws VegetableException
	 * @see VegetableCreate#createVegetable(String, VegetableType, double)
	 */
	@Test
	void createPlane() throws VegetableException {

		double weight1 = 0.9;
		double weight2 = 0.1;
		double weight3 = 0.4;

		Vegetable expected = new FruitVegetable(0.9, FruitType.PEPPER);
		assertEquals(expected, vCreate.createVegetable("PEPPER", VegetableType.FRUIT_VEGETABLE, weight1));

		Vegetable expected2 = new LeafVegetable(0.1, LeafType.CABBAGE);
		assertEquals(expected2, vCreate.createVegetable("CABBAGE", VegetableType.LEAF_VEGETABLE, weight2));

		Vegetable expected3 = new RootVegetable(0.4, RootType.RADISH);
		assertEquals(expected3, vCreate.createVegetable("RADISH", VegetableType.ROOT_VEGETABLE, weight3));

		Vegetable expected4 = new RootVegetable(0.4, RootType.BEET);
		assertEquals(expected4, vCreate.createVegetable("Pepper", VegetableType.ROOT_VEGETABLE, weight3));
	}
}
