package service.impl;

import entity.Cone;
import service.LocationService;

public class LocationServiceImpl implements LocationService {

    @Override
    public boolean isOnXAxis(Cone cone) {
        double yCoordinate = cone.getCenter().y();
        double zCoordinate = cone.getCenter().z();
        return yCoordinate == 0 && zCoordinate <= cone.getRadius() && zCoordinate >= (-cone.getRadius());
    }

    @Override
    public boolean isOnYAxis(Cone cone) {
        double xCoordinate = cone.getCenter().x();
        double zCoordinate = cone.getCenter().z();
        return xCoordinate <= cone.getRadius() && xCoordinate >= (-cone.getRadius()) && zCoordinate <= cone.getRadius() && zCoordinate >= (-cone.getRadius());
    }

    @Override
    public boolean isOnZAxis(Cone cone) {
        double xCoordinate = cone.getCenter().x();
        double yCoordinate = cone.getCenter().y();
        return yCoordinate == 0 && xCoordinate <= cone.getRadius() && xCoordinate >= (-cone.getRadius());
    }
}
