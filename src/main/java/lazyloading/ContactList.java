package lazyloading;

import java.util.ArrayList;
import java.util.List;

public class ContactList implements IContactList {
    // a method to retrieve the list
    @Override
    public List<Employees> getEmployeesList() {
        return getEmpList();
    }

    private static List<Employees> getEmpList() {
        List<Employees> empList = new ArrayList<Employees>(5);
// adding employees to the list
        empList.add(new Employees("Mukesh", 3452.67, "JSE"));
        empList.add(new Employees("Amit", 22345, "ASE"));
        empList.add(new Employees("Naman", 3256.17, "G4"));
        empList.add(new Employees("Vipul", 4895.34, "SDE1"));
        empList.add(new Employees("Akhil", 2857.91, "SDE2"));
        return empList;
    }
}
