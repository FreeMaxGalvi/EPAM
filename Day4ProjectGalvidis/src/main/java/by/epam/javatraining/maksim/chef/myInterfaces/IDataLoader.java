package by.epam.javatraining.maksim.chef.myInterfaces;

import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.myexception.SaladException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * This is interface IDataLoader.
 * 
 * @author Maksim Halvidzis
 * @since 20-08-2019
 * @version 2.0
 */
public interface IDataLoader {

	void loadSaladData(File file, Salad salad) throws FileNotFoundException;


}
