package reflection;

public class Test {


    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }

    private final String name;
    private int age;

    private void show() {
        System.out.println("In show");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
