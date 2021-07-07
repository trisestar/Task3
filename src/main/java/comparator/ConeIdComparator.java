package comparator;

import entity.Cone;

import java.util.Comparator;

public class ConeIdComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        return Long.compare(coneFirst.getId(), coneSecond.getId());
    }
}