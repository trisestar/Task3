package parser;


import entity.Cone;
import entity.Point;
import exception.ParseIntException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Parser {

    private static final Logger logger = LogManager.getLogger();

    public static List findCones(String str) {
        ArrayList<Cone> list = new ArrayList<>();

        str = str.replaceAll("\r", "");

        String[] splitted = str.split("\n");
        double[] doubleBuf = new double[5];

        for (String string : splitted) {
            System.out.println(string);

            String[] splittedAgain = string.split(" ");
            Arrays.stream(splittedAgain).forEach(s -> System.out.println(s));

            if (splittedAgain.length == 5) {
/*                    for (int i = 0;i<5;i++) {

                        try {
                            if (!splittedAgain[i].matches("[-+]?\\d+")) {
                                throw new ParseIntException("String contains wrong symbols: " + splittedAgain[i]);

                            }
                            doubleBuf[i]= Double.parseDouble(splittedAgain[i]);

                        } catch (ParseIntException exception) {
                            exception.printStackTrace();
                            logger.error(exception);
                            list.clear();
                            break;
                        }


                    }*/
                try {
                    if (splittedAgain[0].matches("\\d{8}")) {
                        doubleBuf[0] = Double.parseDouble(splittedAgain[0]);
                    } else {
                        throw new ParseIntException("Wrong line " + splittedAgain[0]);
                    }

                    for (int i = 1; i < 5; i++) {
                        if (splittedAgain[i].matches("[-+]?\\d+")){
                            doubleBuf[i]= Double.parseDouble(splittedAgain[i]);
                        } else {
                            throw new ParseIntException("Wrong line " + splittedAgain[i]);
                        }
                    }
                    list.add(new Cone((int) doubleBuf[0], new Point(doubleBuf[1], doubleBuf[2]), doubleBuf[3], doubleBuf[4]));
                } catch (ParseIntException exception) {
                    exception.printStackTrace();
                    logger.error(exception);
                    list.clear();
                    break;
                }

            }

        }


        return list;
    }


}
