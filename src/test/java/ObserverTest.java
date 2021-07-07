import entity.Cone;
import entity.ConeParams;
import entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.ConeRepository;
import warehouse.Warehouse;

public class ObserverTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void observerTest() {
        ConeRepository repository = ConeRepository.getInstance();
        Warehouse warehouse = Warehouse.getInstance();


        repository.add(new Cone(31234556, new Point(-3, 0, -1), 2, 3));
        warehouse.calculateAndPut(repository.get(0));

        Cone customCone = repository.get(0);
        logger.log(Level.INFO, customCone);
        logger.log(Level.INFO, warehouse.get(customCone.getId()));

        customCone.setRadius(5);

        logger.log(Level.INFO,"new: ");
        logger.log(Level.INFO, repository.set(customCone, 0));
        logger.log(Level.INFO, warehouse.get(customCone.getId()));

        Assert.assertEquals(warehouse.get(customCone.getId()), new ConeParams(170.13219452115223,91.5923781814074,5.830951894845301,78.53981633974483));
    }

}
