package structuralpattern.compositedesign;


import java.util.ArrayList;
import java.util.List;

interface Component {
    public void showPrice();
}

class Leaf implements Component {
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}

class Composite implements Component {
    String name;

    public Composite(String name) {
        this.name = name;
    }
    List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c : components) {
            c.showPrice();
        }

    }
}
