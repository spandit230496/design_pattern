package LLD.design_patterns.behavioral_patterns.observer_design_pattern.concrete_class;
import LLD.design_patterns.behavioral_patterns.observer_design_pattern.interfaces.Observer;

public class Subscriber  implements Observer{
    
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video uploaded - " + videoTitle);
    }
    
}
