package creationaldesignpattern.builderpatternmethod;

//Return type after setting value is phoneBuilder which is converting complex objects into simple objects
// So we can set values of phone instead of using multiple constructor in phone class
public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    //Setting values whose and returning the same object after setting values

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
