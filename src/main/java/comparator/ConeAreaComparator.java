package comparator;

import entity.Cone;

import java.util.Comparator;

public class ConeAreaComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        return Double.compare(coneFirst.getCenter().x(), coneSecond.getCenter().x());
    }
}
