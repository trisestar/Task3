package comparator;

import entity.Cone;
import service.Service;
import service.impl.ServiceImpl;

import java.util.Comparator;

public class ConeGeneratrixComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone coneFirst, Cone coneSecond) {
        Service service = new ServiceImpl();
        return Double.compare(service.calcGeneratrix(coneFirst), service.calcGeneratrix(coneSecond));
    }
}