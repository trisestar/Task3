package service.impl;

import entity.Cone;
import service.Service;

public class ServiceImpl implements Service {
    public double calcGeneratrix(Cone cone) {
        return Math.sqrt(cone.height() * cone.height() + cone.radius() * cone.radius());
    }

    public double calcArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone) * cone.radius() * Math.PI + Math.PI * cone.radius() * cone.radius();
    }

    public double calcSideArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone) * cone.radius() * Math.PI;
    }

    public double calcVolume(Cone cone) {
        return cone.radius() * cone.radius() * cone.height() * Math.PI / 3;
    }

    public double calcVolumeRatio(Cone cone, Double planeY) {
        if (planeY < cone.center().y() || planeY > (cone.center().y() + cone.height())) {
            return -1;
        }

        Service service = new ServiceImpl();
        double smallHeight = cone.height() - planeY + cone.center().y();
        double smallRadius = cone.radius() * smallHeight / cone.height();
        double volumeOfCone = service.calcVolume(cone);
        double volumeOfSplit = smallRadius * smallRadius * smallHeight * Math.PI / 3;

        return volumeOfCone / volumeOfSplit;
    }

    public boolean isCone(Cone cone) {
        if (cone.height() <= 0 || cone.radius() <= 0) {
            return false;
        }
        return true;
    }


}
