package reflection;

public class Sample {
    String name;
    int age;

    void print() {

        System.out.println("print method");

    }

    void display() {
        System.out.println("Display method");
    }

    void add() {
        int a = 20;
        int b = 50;
        System.out.println(a + b);
    }

    public Sample() {
    }

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }


}


