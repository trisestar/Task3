package repository.impl;

import entity.Cone;
import repository.Specification;

public class ZSpecification implements Specification {
    double targetZMin;
    double targetZMax;
    public ZSpecification (double targetZMin, double targetZMax){
        this.targetZMin =targetZMin;
        this.targetZMax =targetZMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.center().z()<= targetZMax && cone.center().z()>= targetZMin){
            return true;
        }
        return false;
    }
}
