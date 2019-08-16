package by.epam.javatraining.maksim.chef.utils;

import by.epam.javatraining.maksim.chef.entity.chefentity.Vegetable;
import by.epam.javatraining.maksim.chef.entity.saladentity.Salad;
import by.epam.javatraining.maksim.chef.myInterfaces.IDataLoader;
import by.epam.javatraining.maksim.chef.myenum.VegetableType;
import by.epam.javatraining.maksim.chef.myexception.VegetableException;
import org.apache.log4j.Logger;
import java.io.FileReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;


public class DataLoader implements IDataLoader {
    private static Logger logger = Logger.getLogger(DataLoader.class);

    VegetableType vegetableType = null;

    @Override
    public void loadSaladData(Salad salad) {

        VegetableCreate vegetableCreate = new VegetableCreate();
        Vegetable vegetable;

        VegetableType type;
        String name;
        double weight;

        try (Reader in = new FileReader("vegetables.txt")) {
            Iterable<CSVRecord> vegetableData = CSVFormat.DEFAULT.withHeader(VEGETABLE_HEADERS).withFirstRecordAsHeader()
                    .parse(in);

            for (CSVRecord data : vegetableData) {
                try {
                    type = VegetableType.valueOf(data.get("Type"));
                    name = data.get("Name");
                    weight = new Double(data.get("Weight"));
                    switch (type) {
                        case FRUIT_VEGETABLE:
                            vegetableType = VegetableType.FRUIT_VEGETABLE;
                            vegetable = vegetableCreate.createVegetable(name, vegetableType, weight);
                            break;
                        case LEAF_VEGETABLE:
                            vegetableType = VegetableType.LEAF_VEGETABLE;
                            vegetable = vegetableCreate.createVegetable(name, vegetableType, weight);
                            break;
                        case ROOT_VEGETABLE:
                            vegetableType = VegetableType.ROOT_VEGETABLE;
                            vegetable = vegetableCreate.createVegetable(name, vegetableType, weight);
                            break;
                        default:
                            throw new VegetableException("wrong vegetable type: " + type);
                    }

                } catch (Exception exception) {
                    logger.error(exception);
                }
            }
        } catch (Exception exception) {
            logger.error(exception);
        }
    }
}
