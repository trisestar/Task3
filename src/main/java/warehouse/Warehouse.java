package warehouse;

import entity.Cone;
import entity.ConeParams;
import service.Service;
import service.impl.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final Map<Long, ConeParams> paramsMap = new HashMap<>();

    public static Warehouse getInstance() {
        return Warehouse.SingletonHolder.instance;
    }

    public ConeParams put(long id, ConeParams coneParams) {
        return paramsMap.put(id, coneParams);
    }

    public ConeParams calculateAndPut(Cone cone) {
        Service service = new ServiceImpl();
        double area = service.calcArea(cone);
        double sideArea = service.calcSideArea(cone);
        double volume = service.calcVolume(cone);
        double generatrix = service.calcGeneratrix(cone);
        return paramsMap.put(cone.getId(), new ConeParams(area, sideArea, generatrix, volume));
    }

    public ConeParams remove(long coneId) {
        return paramsMap.remove(coneId);
    }

    public Map<Long, ConeParams> getParamsMap() {
        return paramsMap;
    }

    public ConeParams get(long coneId) {
        return paramsMap.get(coneId);
    }

    private static class SingletonHolder {
        private static final Warehouse instance = new Warehouse();
    }
}
