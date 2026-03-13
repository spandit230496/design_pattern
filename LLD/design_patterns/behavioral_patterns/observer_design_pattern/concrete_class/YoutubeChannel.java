package LLD.design_patterns.behavioral_patterns.observer_design_pattern.concrete_class;
import java.util.ArrayList;
import java.util.List;

import LLD.design_patterns.behavioral_patterns.observer_design_pattern.interfaces.Observable;
import LLD.design_patterns.behavioral_patterns.observer_design_pattern.interfaces.Observer;

public class YoutubeChannel  implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private String videoTitle;

    public void uploadVideo(String title) {
        this.videoTitle = title;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(videoTitle);
        }
    }
}
