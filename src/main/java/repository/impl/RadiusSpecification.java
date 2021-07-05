package repository.impl;

import entity.Cone;
import repository.Specification;

public class RadiusSpecification implements Specification {
    double targetRadiusMin;
    double targetRadiusMax;
    public RadiusSpecification (double targetRadiusMin, double targetRadiusMax){
        this.targetRadiusMin =targetRadiusMin;
        this.targetRadiusMax =targetRadiusMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.radius()<= targetRadiusMax && cone.radius()>= targetRadiusMin){
            return true;
        }
        return false;
    }
}
