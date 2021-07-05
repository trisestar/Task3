package repository.impl;

import entity.Cone;
import repository.Specification;

public class YSpecification implements Specification {
    double targetYMin;
    double targetYMax;
    public YSpecification (double targetYMin, double targetYMax){
        this.targetYMin =targetYMin;
        this.targetYMax =targetYMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.center().y()<= targetYMax && cone.center().y()>= targetYMin){
            return true;
        }
        return false;
    }
}
