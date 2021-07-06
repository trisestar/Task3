package service.impl;

import entity.Cone;
import service.LocationService;

public class LocationServiceImpl implements LocationService {

    @Override
    public boolean isOnXAxis(Cone cone) {
        double yCoordinate = cone.getCenter().y();
        double zCoordinate = cone.getCenter().z();
        if (yCoordinate ==0 && zCoordinate<= cone.getRadius() && zCoordinate >= (-cone.getRadius())){
            return true;
        }
        return false;
    }

    @Override
    public boolean isOnYAxis(Cone cone) {
        double xCoordinate = cone.getCenter().x();
        double zCoordinate = cone.getCenter().z();
        if (xCoordinate<= cone.getRadius() && xCoordinate >= (-cone.getRadius()) && zCoordinate<= cone.getRadius() && zCoordinate >= (-cone.getRadius())){
            return true;
        }
        return false;
    }

    @Override
    public boolean isOnZAxis(Cone cone) {
        double xCoordinate = cone.getCenter().x();
        double yCoordinate = cone.getCenter().y();
        if (yCoordinate ==0 && xCoordinate<= cone.getRadius() && xCoordinate >= (-cone.getRadius())){
            return true;
        }
        return false;
    }
}
