package lazyloading;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //The concept of delaying the loading of an object until one needs it is known as lazy loading.
    // In other words, it is the process of delaying the process of instantiating the class until required.
    public static void main(String[] args) {
///we have instantiated the ContactListProxy class. At this point, the list of employees is not created.
// It is because the list of employees is not required at this point of time. When the list of employees is
// required, the method getEmployeeList() is invoked, and at the same time, the list of employees is created,
// which shows the creation of the list of employees is delayed until required.

        // instantiating the ContactListProxy class
        IContactList contactListObj = new ContactListProxy();


        // instantiating the company class
        Company companyObj = new Company("ABC", "India", "+91-011-55512347", contactListObj);
        System.out.println("Company Name: " + companyObj.getCompnyName());
        System.out.println("Company Address: " + companyObj.getCompnyAddress());
        System.out.println("Company Contact No.: " + companyObj.getCompnyContactNo() + "\n");
        System.out.println("Requesting for the contact list ...");


        // When the list of employees is required, the method getEmployeeList() is invoked otherwise list of
        // employees is not instantiated and contactListObj is still empty before calling the method
        // get-employeeList

        contactListObj = companyObj.getContctList();
        System.out.println(companyObj);
        List<Employees> employeeList = contactListObj.getEmployeesList();
        System.out.println(companyObj.getContctList());
        System.out.println(companyObj);
// printing the fetched list
        for (Employees emp : employeeList) {
            System.out.println(emp);
        }
    }

}