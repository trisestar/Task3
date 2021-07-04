package service;

import entity.Cone;

public interface Service {
    public double calcGeneratrix(Cone cone);

    public double calcArea(Cone cone);

    public double calcSideArea(Cone cone);

    public double calcVolume(Cone cone);

    public double calcVolumeRatio(Cone cone, Double planeY);
}
