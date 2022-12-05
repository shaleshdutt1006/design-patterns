package creationaldesignpattern.factorydesignmethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class
for creating an object but let the subclasses decide which class to instantiate. In other words,
subclasses are responsible to create the instance of the class.
The Factory Method Pattern is also known as Virtual Constructor.
 */
public class GenerateBill {


    public static void main(String[] args) throws IOException {


    GetPlanFactory getPlanFactory=new GetPlanFactory();

    System.out.println("Enter the name of plan for which the bill will be generated: ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planName=br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p= getPlanFactory.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");

        p.getRate();
        p.calculateBill(units);

    }
}
