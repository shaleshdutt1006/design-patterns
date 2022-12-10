package lazyloading;

public class Company {

    // fields of the company class
    String cName;
    String cAddress;
    String cContactNo;
    IContactList contctList;

    // constructor of the list for  initializing the class fields
    public Company(String cName, String cAddress, String cContactNo, IContactList contctList) {
        this.cName = cName;
        this.cAddress = cAddress;
        this.cContactNo = cContactNo;
        this.contctList = contctList;
    }

    // a getter method to retrieve the company name
    public String getCompnyName() {
        return this.cName;
    }

    // a getter method to retrieve the address of the company
    public String getCompnyAddress() {
        return this.cAddress;
    }

    public String getCompnyContactNo() {
        return this.cContactNo;
    }

//This method is used to instantiate employee list because it will return IContactList which override in
// ContactList class where employee is added already

    public IContactList getContctList() {
        return this.contctList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cName='" + cName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cContactNo='" + cContactNo + '\'' +
                ", contctList=" + contctList +
                '}';
    }
}

