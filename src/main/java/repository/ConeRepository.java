package repository;

import entity.Cone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConeRepository {
    private List<Cone> cones = new ArrayList<>();

    private static class SingletonHolder {
        private static final ConeRepository instance = new ConeRepository();
    }

    public static ConeRepository getInstance() {
        return SingletonHolder.instance;
    }

    public boolean add (Cone newCone){
        return cones.add(newCone);
    }

    public boolean isEmpty(){
        return cones.isEmpty();
    }

    public boolean addAll (Collection<? extends Cone> c){
        return cones.addAll(c);
    }

    public boolean removeAll (Collection<Cone> c) {
        return cones.removeAll(c);
    }

    public Cone get (int index){
        return cones.get(index);
    }

    public List<Cone> getAll(){
        return new ArrayList<>(cones);
    }

    public Cone set (Cone cone, int index){
        return cones.set(index, cone);
    }

    public List<Cone> query(Specification specification){
        return cones.stream().filter(specification::specify).collect(Collectors.toList());
    }

    public List<Cone> query(Predicate<Cone> specification){
        return cones.stream().filter(specification).collect(Collectors.toList());
    }

}
