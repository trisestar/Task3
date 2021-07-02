import entity.Cone;
import entity.Point;
import org.testng.annotations.Test;
import parser.Parser;
import reader.StreamReader;
import service.impl.ServiceImpl;

import java.util.List;

public class Tests {
    @Test
    public void getArea(){
        Point center = new Point(0, 0 );
        Cone cone = new Cone(11234145, center, 2,3);
        ServiceImpl service = new ServiceImpl();
        System.out.println(service.calcArea(cone));
        System.out.println(service.calcVolume(cone));
    }

    @Test
    public void loadCone(){
        String data = StreamReader.readFile("C:\\Users\\a21pl\\IdeaProjects\\Task3\\src\\main\\resources\\toread\\data.txt");
        List coneList = Parser.findCones(data);
        coneList.stream().forEach(s-> System.out.println(s));
    }
}
