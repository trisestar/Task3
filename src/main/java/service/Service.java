package service;

import entity.Cone;

public interface Service {
    double calcGeneratrix(Cone cone);

    double calcArea(Cone cone);

    double calcSideArea(Cone cone);

    double calcVolume(Cone cone);

    double calcVolumeRatio(Cone cone, Double planeY);

    boolean isCone(Cone cone);
}
