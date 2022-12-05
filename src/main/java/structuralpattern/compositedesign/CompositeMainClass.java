package structuralpattern.compositedesign;


//allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects
public class CompositeMainClass {
    //Composite pattern is used where we need to treat a group of objects in similar way as a single object
//Composite pattern composes of a tree structure who have composite object and composite object has many object
//inside it, and it has leaf object.

    public static void main(String[] args) {


        Component harddrive = new Leaf(4000, "HDD");
        Component mouse = new Leaf(500, "mouse");
        Component monitor = new Leaf(10000, "monitor");
        Component Ram = new Leaf(5000, "Ram");
        Component keyboard = new Leaf(1500, "keyboard");

//These composite object consist of multiple object it will give value of all the object inside it
        Composite peripheral = new Composite("peripheral");
        Composite cabinet = new Composite("cabinet");
        Composite motherboard = new Composite("motherboard");
        Composite computer = new Composite("computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(keyboard);
        motherboard.addComponent(Ram);
        motherboard.addComponent(harddrive);
//This is composite of composite object
        cabinet.addComponent(motherboard);
        cabinet.addComponent(harddrive);
        cabinet.addComponent(motherboard);
//This is composite of composite object
        computer.addComponent(cabinet);
        computer.addComponent(peripheral);


        Ram.showPrice();
        peripheral.showPrice();
        cabinet.showPrice();
        computer.showPrice();
    }
}