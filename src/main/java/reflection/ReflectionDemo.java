package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

//Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
//Reflection is used for debugging widely
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Class c = Class.forName("reflection.Sample");
        //Checking name of the class
        System.out.println(c.getName());

//Accessing private parameters by using reflection we cannot change final variable declared in Test class,but we
//can change it using reflection using set accessible
        Test test = new Test("Amit", 54);
        Field[] field = test.getClass().getDeclaredFields();
        for (Field f : field) {
            if (f.getName().equalsIgnoreCase("name")) {
                f.setAccessible(true);
                f.set(test, "Anshul");
            }
        }
        System.out.println(test.getName());

//Accessing private method of test class using setAccessible. You can call the private method from outside the
//class by changing the runtime behaviour of the class using reflection only way to access private methods.
        Method m = test.getClass().getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(test, null);


        Sample sample = new Sample();
        //Checking Sample class is interface or not
        System.out.println(sample.getClass().isInterface());
        //Checking super or parent class of Sample class
        System.out.println("Super class of sample class is " + sample.getClass().getSuperclass());
        //give number of constructors in the class
        System.out.println(sample.getClass().getDeclaredConstructor());
//Give method of the class
        System.out.println(sample.getClass().getDeclaredMethod("print"));
        //Give all the methods of the class
        System.out.println("Methods in the sample class are:" + Arrays.stream(sample.getClass().getDeclaredMethods()).collect(Collectors.toList()));
//Give all the fields or parameter of the class
        System.out.println(Arrays.stream(sample.getClass().getDeclaredFields()).collect(Collectors.toList()));

//It returns the instance of Class class. It should be used if you know the type.

        test.printName(sample);


    }
}
