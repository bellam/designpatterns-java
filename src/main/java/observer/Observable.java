package observer;

public interface Observable {

    public void add(Observer pObserver);

    public void remove(Observer pObserver);

    public void notifyObservers();

}