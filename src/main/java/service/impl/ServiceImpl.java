package service.impl;

import entity.Cone;

public class ServiceImpl {
    public double calcGeneratrix(Cone cone) {
        return Math.sqrt( (cone.height() * cone.height()) + (cone.radius() * cone.radius()) );
    }

    public double calcArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone)*cone.radius()*Math.PI+Math.PI*cone.radius()* cone.radius();
    }

    public double calcSideArea(Cone cone) {
        ServiceImpl service = new ServiceImpl();
        return service.calcGeneratrix(cone)*cone.radius()*Math.PI;
    }

    public double calcVolume(Cone cone){
        return cone.radius()* cone.radius()* cone.height()*Math.PI/3;
    }

}
