import entity.Cone;
import entity.Point;
import observer.Observer;
import observer.impl.ConeObserver;
import org.testng.annotations.Test;
import parser.Parser;
import reader.StreamReader;
import repository.ConeRepository;
import repository.Specification;
import repository.impl.HeightSpecification;
import service.LocationService;
import service.Service;
import service.impl.LocationServiceImpl;
import service.impl.ServiceImpl;
import warehouse.Warehouse;

import java.util.List;

public class Tests {
    @Test
    public void getArea(){
        Point center = new Point(0, 0 , 0);
        Cone cone = new Cone(11234145, center, 2,3);
        ServiceImpl service = new ServiceImpl();
        System.out.println(service.calcArea(cone));
        System.out.println(service.calcVolume(cone));
    }

    @Test
    public void loadAddGet(){
        String data = StreamReader.readFile("C:\\Users\\a21pl\\IdeaProjects\\Task3\\src\\main\\resources\\toread\\data.txt");
        List coneList = Parser.findCones(data);
        coneList.forEach(System.out::println);
        ConeRepository coneRepository = ConeRepository.getInstance();
        coneRepository.addAll(coneList);
        coneRepository.getAll().forEach(System.out::println);
    }

    @Test
    public void isOnX(){
        Point center = new Point(0, 0 , -2);
        Cone cone = new Cone(11234145, center, 2,3);
        LocationService locationService = new LocationServiceImpl();
        System.out.println(locationService.isOnXAxis(cone));
    }

    @Test
    public void isOnY(){
        Point center = new Point(0, 0 , -2);
        Cone cone = new Cone(11234145, center, 2,3);
        LocationService locationService = new LocationServiceImpl();
        System.out.println(locationService.isOnYAxis(cone));
    }

    @Test
    public void isOnZ(){
        Point center = new Point(-2, 0 , -2);
        Cone cone = new Cone(11234145, center, 2,3);
        LocationService locationService = new LocationServiceImpl();
        System.out.println(locationService.isOnZAxis(cone));
    }

    @Test
    public void vols(){
        Point center = new Point(0, 0 , 0);
        Cone cone = new Cone(11234145, center, 1,3);
        Service service = new ServiceImpl();
        System.out.println(service.calcVolumeRatio(cone, 2.0));
    }

    @Test
    public void specTest(){
        Point center = new Point(0, 0 , 0);
        Cone cone = new Cone(11234145, center, 1,3);
        Specification specification= new HeightSpecification(2,4);
        System.out.println(specification.specify(cone));
    }

    @Test
    public void test(){
        ConeRepository repository = ConeRepository.getInstance();
        Observer observer = new ConeObserver();
        Warehouse warehouse = Warehouse.getInstance();

        Point center = new Point(0, 0 , 0);
        Cone cone = new Cone(11234145, center, 1,3);

        System.out.println(repository.add(cone));
        repository.getAll().forEach(System.out::println);
        System.out.println(warehouse.calculateAndPut(cone));
        warehouse.getParamsMap().forEach((x,y)-> System.out.println(x+"   "+y));

        cone.attach(observer);
        cone.setHeight(10);
        warehouse.getParamsMap().forEach((x,y)-> System.out.println(x+"   "+y));
    }
}
