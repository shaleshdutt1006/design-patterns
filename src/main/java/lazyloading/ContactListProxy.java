package lazyloading;

import java.util.List;

public class ContactListProxy implements IContactList {


    private IContactList contctList;

    @Override
    public List<Employees> getEmployeesList() {
        if (contctList == null) {
            System.out.println("Fetching the list of employees ... \n");
            contctList = new ContactList();
        }
        return contctList.getEmployeesList();
    }

    @Override
    public String toString() {
        return "ContactListProxy{" +
                "contctList=" + contctList +
                '}';
    }
}

