package creationaldesignpattern.singletonmethod;


//Three steps to make a singleton object we need to have private static member of class, private constructor and
// create only getter no setter to use memory only one time
public class Main {
    public static void main(String[] args) {

//We are using two objects here, but they are using memory once
        Singleton object1 = Singleton.getInstance();
        object1.simpleMethod();

        Singleton object2 = Singleton.getInstance();
        object2.simpleMethod();
    }
}
