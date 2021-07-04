package service.impl;

import entity.Cone;
import service.LocationService;

public class LocationServiceImpl implements LocationService {

    @Override
    public boolean isOnXAxis(Cone cone) {
        double yCoordinate = cone.center().y();
        double zCoordinate = cone.center().z();
        if (yCoordinate ==0 && zCoordinate<= cone.radius() && zCoordinate >= (-cone.radius())){
            return true;
        }
        return false;
    }

    @Override
    public boolean isOnYAxis(Cone cone) {
        double xCoordinate = cone.center().x();
        double zCoordinate = cone.center().z();
        if (xCoordinate<= cone.radius() && xCoordinate >= (-cone.radius()) && zCoordinate<= cone.radius() && zCoordinate >= (-cone.radius())){
            return true;
        }
        return false;
    }

    @Override
    public boolean isOnZAxis(Cone cone) {
        double xCoordinate = cone.center().x();
        double yCoordinate = cone.center().y();
        if (yCoordinate ==0 && xCoordinate<= cone.radius() && xCoordinate >= (-cone.radius())){
            return true;
        }
        return false;
    }
}
