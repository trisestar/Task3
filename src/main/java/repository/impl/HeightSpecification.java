package repository.impl;

import entity.Cone;
import repository.Specification;

public class HeightSpecification implements Specification {
    double targetHeightMin;
    double targetHeightMax;
    public HeightSpecification (double targetHeightMin, double targetHeightMax){
        this.targetHeightMin=targetHeightMin;
        this.targetHeightMax=targetHeightMax;
    }

    @Override
    public boolean specify(Cone cone) {
        if (cone.height()<=targetHeightMax && cone.height()>=targetHeightMin){
            return true;
        }
        return false;
    }
}
