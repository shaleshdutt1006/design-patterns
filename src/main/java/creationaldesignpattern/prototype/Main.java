package creationaldesignpattern.prototype;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Prototype Pattern says that cloning of an existing object instead of creating new one and can also be
// customized as per the requirement.This pattern should be followed, if the cost of creating a new object
// is expensive
//This will give a new object but not using database call which is expensive
//e1.clone is used to give clone of the object e1
public class Main {
            public static void main(String[] args) throws IOException {

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Employee Id: ");
            int eid=Integer.parseInt(br.readLine());
            System.out.print("\n");

            System.out.print("Enter Employee Name: ");
            String ename=br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Designation: ");
            String edesignation=br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Address: ");
            String eaddress=br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Salary: ");
            double esalary= Double.parseDouble(br.readLine());
            System.out.print("\n");

            EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

            e1.showRecord();
            System.out.println("\n");

            //e1.clone is used to give clone of the object e1
            EmployeeRecord e2=(EmployeeRecord) e1.getClone();
            e2.showRecord();
        }
    }

