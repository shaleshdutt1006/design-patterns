package structuralpattern.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subscribers = new ArrayList<>();

    public String title;

    public void Subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void UnSubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update();
        }
    }

    public void Upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
