package creationaldesignpattern.singletonmethod;


//Singleton Pattern says that just define a class that has only one instance and provides a global point of
// access to it.n other words, a class must ensure that only single instance should be created and single
// object can be used by all other classes
public class Singleton {

    //This static variable is used because only one time memory is used for the instance
    private static Singleton singleton=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return singleton;
    }
    public void simpleMethod(){
        System.out.println("Hashcode of singleton object is "+singleton);
    }
}
