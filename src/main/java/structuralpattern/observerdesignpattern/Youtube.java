package structuralpattern.observerdesignpattern;


//An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state,
// all its dependents are notified and updated automatically.
public class Youtube {
    public static void main(String[] args) {
//There are various subscribers in YouTube and each one notify when there is change this is observer design pattern


        Channel worldaffairs = new Channel();
        Channel bridgelabz = new Channel();
        Subscriber subscriber1 = new Subscriber("Parshant");
        Subscriber subscriber2 = new Subscriber("Amit");
        Subscriber subscriber3 = new Subscriber("Anshul");
        Subscriber subscriber4 = new Subscriber("Anita");
        worldaffairs.Subscribe(subscriber2);
        worldaffairs.Subscribe(subscriber2);
        bridgelabz.Subscribe(subscriber3);
        bridgelabz.Subscribe(subscriber4);
        subscriber1.subscribedChannel(worldaffairs);
        subscriber2.subscribedChannel(worldaffairs);
        subscriber3.subscribedChannel(bridgelabz);
        subscriber4.subscribedChannel(bridgelabz);
        worldaffairs.Upload("How to learn programming");
        bridgelabz.Upload("What is observer Pattern");
    }
}
