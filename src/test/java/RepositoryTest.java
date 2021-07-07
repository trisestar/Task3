import entity.Cone;
import entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.ConeRepository;
import repository.Specification;
import repository.impl.XSpecification;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void repositoryTest() {
        ConeRepository repository = ConeRepository.getInstance();
        Cone cone = new Cone(31234556, new Point(-3, 0, -1), 2, 3);
        repository.add(cone);
        Assert.assertEquals(repository.get(0), cone);
    }

    @Test
    public void specificationTest() {
        ConeRepository repository = ConeRepository.getInstance();
        Cone cone = new Cone(31234556, new Point(-3, 0, -1), 2, 3);
        repository.add(cone);
        cone = new Cone(31234557, new Point(2, 2, 2), 5, 6);
        repository.add(cone);

        List<Cone> expectedList = new ArrayList<>();
        expectedList.add(cone);

        Specification xSpecification = new XSpecification(0, 5);
        repository.query(xSpecification).forEach(x -> logger.log(Level.INFO, x));

        Assert.assertEquals(expectedList, repository.query(xSpecification));

    }
}
