package parser;

import entity.Cone;
import entity.Point;
import exception.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final Logger logger = LogManager.getLogger();

    public static List findCones(String str) {
        ArrayList<Cone> list = new ArrayList<>();

        str = str.replaceAll("\r", "");

        String[] splitted = str.split("\n");
        double[] doubleBuf = new double[6];

        for (String string : splitted) {

            String[] splittedAgain = string.split(" ");

            if (splittedAgain.length == 6) {
                try {
                    if (splittedAgain[0].matches("\\d{8}")) {
                        doubleBuf[0] = Double.parseDouble(splittedAgain[0]);
                    } else {
                        throw new ParseException("Wrong line " + splittedAgain[0]);
                    }

                    for (int i = 1; i < 6; i++) {
                        if (splittedAgain[i].matches("[-+]?\\d+")) {
                            doubleBuf[i] = Double.parseDouble(splittedAgain[i]);
                        } else {
                            throw new ParseException("Wrong line " + splittedAgain[i]);
                        }
                    }
                    list.add(new Cone((long) doubleBuf[0], new Point(doubleBuf[1], doubleBuf[2], doubleBuf[3]), doubleBuf[4], doubleBuf[5]));
                } catch (ParseException exception) {
                    exception.printStackTrace();
                    logger.error(exception);
                }
            }
        }
        return list;
    }
}
