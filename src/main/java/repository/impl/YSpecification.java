package repository.impl;

import entity.Cone;
import repository.Specification;

public class YSpecification implements Specification {
    double targetYMin;
    double targetYMax;

    public YSpecification(double targetYMin, double targetYMax) {
        this.targetYMin = targetYMin;
        this.targetYMax = targetYMax;
    }

    @Override
    public boolean specify(Cone cone) {
        return cone.getCenter().y() <= targetYMax && cone.getCenter().y() >= targetYMin;
    }
}
