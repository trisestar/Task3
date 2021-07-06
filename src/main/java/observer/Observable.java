package observer;

public interface Observable {
    void attach(Observer observer);

    void detach();

    void notifyObserver();
}