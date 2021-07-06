package service.impl;

import entity.Cone;
import service.Service;

public class ServiceImpl implements Service {
    public double calcGeneratrix(Cone cone) {
        return Math.sqrt(cone.getHeight() * cone.getHeight() + cone.getRadius() * cone.getRadius());
    }

    public double calcArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone) * cone.getRadius() * Math.PI + Math.PI * cone.getRadius() * cone.getRadius();
    }

    public double calcSideArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone) * cone.getRadius() * Math.PI;
    }

    public double calcVolume(Cone cone) {
        return cone.getRadius() * cone.getRadius() * cone.getHeight() * Math.PI / 3;
    }

    public double calcVolumeRatio(Cone cone, Double planeY) {
        if (planeY < cone.getCenter().y() || planeY > (cone.getCenter().y() + cone.getHeight())) {
            return -1;
        }

        Service service = new ServiceImpl();
        double smallHeight = cone.getHeight() - planeY + cone.getCenter().y();
        double smallRadius = cone.getRadius() * smallHeight / cone.getHeight();
        double volumeOfCone = service.calcVolume(cone);
        double volumeOfSplit = smallRadius * smallRadius * smallHeight * Math.PI / 3;

        return volumeOfCone / volumeOfSplit;
    }

    public boolean isCone(Cone cone) {
        if (cone.getHeight() <= 0 || cone.getRadius() <= 0) {
            return false;
        }
        return true;
    }


}
