import entity.Cone;
import entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.impl.ServiceImpl;

public class ServiceTests {
    @Test
    public void calcAreaTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertEquals(service.calcArea(cone), 35.22071741263713);
    }

    @Test
    public void calcSideAreaTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertEquals(service.calcSideArea(cone), 22.654346798277953);
    }

    @Test
    public void calcVolumeTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertEquals(service.calcVolume(cone), 12.566370614359172);
    }

    @Test
    public void calcGeneratrixTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertEquals(service.calcGeneratrix(cone), 3.605551275463989);
    }

    @Test
    public void calcVolumeRatioTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertEquals(service.calcVolumeRatio(cone, 2.0), 27.0);
    }

    @Test
    public void isConeTrueTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 2, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertTrue(service.isCone(cone));
    }

    @Test
    public void isConeFalseTest() {
        Point center = new Point(0, 0, 0);
        Cone cone = new Cone(11234145, center, 0, 3);
        ServiceImpl service = new ServiceImpl();
        Assert.assertFalse(service.isCone(cone));
    }

}
