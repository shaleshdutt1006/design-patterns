package creationaldesignpattern.builderpatternmethod;


//Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
//It is mostly used when object can't be created in single step like in the de-serialization of a complex object.
public class Shop {
    public static void main(String[] args) {


        Phone phone1 = new PhoneBuilder().setOs("Android").setBattery(4000).setRam(2000).getPhone();
        System.out.print(phone1);
        System.out.println();
        Phone phone2 = new PhoneBuilder().setOs("ios").setBattery(5000).setRam(6000).setProcessor("i7").getPhone();
        System.out.print(phone2);
    }
}