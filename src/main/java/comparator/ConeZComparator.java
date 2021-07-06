package comparator;

import entity.Cone;

import java.util.Comparator;

public class ConeZComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        return Double.compare(coneFirst.getCenter().z(), coneSecond.getCenter().z());
    }
}
