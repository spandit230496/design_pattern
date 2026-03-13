package LLD.design_patterns.behavioral_patterns.observer_design_pattern;
import LLD.design_patterns.behavioral_patterns.observer_design_pattern.concrete_class.Subscriber;
import LLD.design_patterns.behavioral_patterns.observer_design_pattern.concrete_class.YoutubeChannel;

public class Main {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();


        Subscriber s1 = new Subscriber("Sandip");
        Subscriber s2 = new Subscriber("Rahul");

        channel.addObserver(s1);
        channel.addObserver(s2);

        channel.uploadVideo("Observer Pattern in Java");
    }
}