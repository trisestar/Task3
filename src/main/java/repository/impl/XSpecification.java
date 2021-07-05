package repository.impl;

import entity.Cone;
import repository.Specification;

public class XSpecification implements Specification {
    double targetXMin;
    double targetXMax;
    public XSpecification (double targetXMin, double targetXMax){
        this.targetXMin =targetXMin;
        this.targetXMax =targetXMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.center().x()<= targetXMax && cone.center().x()>= targetXMin){
            return true;
        }
        return false;
    }
}
