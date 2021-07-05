package repository;

import entity.Cone;

import java.util.List;

public class ConeRepository {
    private List<Cone> cones;

    public void add (Cone newCone){
        cones.add(newCone);
    }

    public boolean isEmpty(){
        return cones.isEmpty();
    }


}
