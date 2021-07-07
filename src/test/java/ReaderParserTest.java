import entity.Cone;
import entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import parser.Parser;
import reader.StreamReader;

import java.util.ArrayList;
import java.util.List;

public class ReaderParserTest {
    @Test
    public void readAndParseTest() {
        List<Cone> expectedList = new ArrayList<>();
        Cone cone = new Cone(31234556, new Point(-3, 0, -1), 2, 3);
        expectedList.add(cone);
        cone = new Cone(31234557, new Point(2, 2, 2), 5, 6);
        expectedList.add(cone);

        String data = StreamReader.readFile("src\\main\\resources\\toread\\data.txt");
        List coneList = Parser.findCones(data);
        Assert.assertEquals(coneList, expectedList);
    }
}
