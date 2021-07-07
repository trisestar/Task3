import entity.Cone;
import entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.LocationService;
import service.impl.LocationServiceImpl;

public class LocationTest {

    @Test
    public void isOnXTest() {
        Point center = new Point(0, 0, -2);
        Cone cone = new Cone(11234145, center, 2, 3);
        LocationService locationService = new LocationServiceImpl();
        Assert.assertTrue(locationService.isOnXAxis(cone));
    }

    @Test
    public void isOnYTest() {
        Point center = new Point(0, 0, -2);
        Cone cone = new Cone(11234145, center, 2, 3);
        LocationService locationService = new LocationServiceImpl();
        Assert.assertTrue(locationService.isOnYAxis(cone));
    }

    @Test
    public void isOnZTest() {
        Point center = new Point(-2, 0, -2);
        Cone cone = new Cone(11234145, center, 2, 3);
        LocationService locationService = new LocationServiceImpl();
        Assert.assertTrue(locationService.isOnZAxis(cone));
    }
}
