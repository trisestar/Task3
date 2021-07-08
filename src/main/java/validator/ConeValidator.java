package validator;

import entity.Cone;

public class ConeValidator {
    public boolean validate(Cone cone){
        if (cone.getHeight()>0 && cone.getRadius()>0 && cone.getId()>0 && cone.getCenter().x()<9999 && cone.getCenter().x()>-9999 &&
                cone.getCenter().y()<9999 && cone.getCenter().y()>-9999 && cone.getCenter().z()<9999 && cone.getCenter().z()>-9999){
            return true;
        }
        return false;
    }
}
