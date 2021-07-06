package comparator;

import entity.Cone;

import java.util.Comparator;

public class ConeYComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        return Double.compare(coneFirst.getCenter().y(), coneSecond.getCenter().y());
    }
}
