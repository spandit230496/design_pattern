package LLD.design_patterns.behavioral_patterns.observer_design_pattern.interfaces;



public interface Observable {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    
    
}