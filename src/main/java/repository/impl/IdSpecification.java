package repository.impl;

import entity.Cone;
import repository.Specification;

public class IdSpecification implements Specification {
    double targetIdMin;
    double targetIdMax;
    public IdSpecification (double targetIdMin, double targetIdMax){
        this.targetIdMin =targetIdMin;
        this.targetIdMax =targetIdMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.getId()<= targetIdMax && cone.getId()>= targetIdMin){
            return true;
        }
        return false;
    }
}

