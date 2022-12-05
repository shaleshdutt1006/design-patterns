package structuralpattern.proxydesign;


//This is the original object who provide internet access to employees
//RealInternetAccess class that will implement OfficeInternetAccess interface for granting the
// permission to the specific employee.
public class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ employeeName);
    }
}
