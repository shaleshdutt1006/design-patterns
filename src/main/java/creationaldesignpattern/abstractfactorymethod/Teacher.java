package creationaldesignpattern.abstractfactorymethod;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("This is teacher class");
    }
}
