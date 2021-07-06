package entity;

import observer.ConeEvent;
import observer.Observable;
import observer.Observer;
import observer.impl.ConeObserver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Cone implements Observable {
    private static Logger logger = LogManager.getLogger();
    long id;
    Point center;
    double radius;
    double height;
    Observer observer = new ConeObserver();

    public Cone(long id, Point center, double radius, double height) {
        this.id = id;
        this.center = center;
        this.radius = radius;
        this.height = height;
    }

    public Cone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        notifyObserver();
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
        notifyObserver();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        notifyObserver();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return id == cone.id && Double.compare(cone.radius, radius) == 0 && Double.compare(cone.height, height) == 0 && Objects.equals(center, cone.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, center, radius, height);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "id=" + id +
                ", center=" + center +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        this.observer=null;
    }

    @Override
    public void notifyObserver() {
        if (observer==null){
            logger.log(Level.INFO,"Observer is null");
        } else {
            ConeEvent coneEvent = new ConeEvent(this);
            observer.parametersChange(coneEvent);
        }
    }
}
