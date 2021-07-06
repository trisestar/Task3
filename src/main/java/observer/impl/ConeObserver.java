package observer.impl;

import entity.Cone;
import entity.ConeParams;
import observer.ConeEvent;
import observer.Observer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.Service;
import service.impl.ServiceImpl;
import warehouse.Warehouse;



public class ConeObserver implements Observer {
    public static Logger logger = LogManager.getLogger();

    @Override
    public void parametersChange(ConeEvent event) {
        Warehouse warehouse = Warehouse.getInstance();
        Service service = new ServiceImpl();
        Cone cone = event.getSource();
        System.out.println(cone);
        double area = service.calcArea(cone);
        double sideArea = service.calcSideArea(cone);
        double generatrix = service.calcGeneratrix(cone);
        double volume = service.calcVolume(cone);
        ConeParams coneParams = new ConeParams(area, sideArea, generatrix, volume);
        warehouse.put(cone.getId(), coneParams);

        logger.log(Level.INFO,"Parameters were changed, id = "+ cone.getId());
    }
}
