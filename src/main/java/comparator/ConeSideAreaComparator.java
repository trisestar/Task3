package comparator;

import entity.Cone;
import service.Service;
import service.impl.ServiceImpl;

import java.util.Comparator;

public class ConeSideAreaComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        Service service = new ServiceImpl();
        return Double.compare(service.calcSideArea(coneFirst), service.calcSideArea(coneSecond));
    }
}