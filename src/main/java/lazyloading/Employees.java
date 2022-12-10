package lazyloading;

public class Employees {
    // fields of the employees class
    private String empName;

    private double empSalary;
    private String empDesignation;

    // constructor of the list for initializing the class fields
    public Employees(String empName, double empSalary, String empDesignation) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
    }

    // a getter method to get employee name
    public String getEmpName() {
        return empName;
    }


    // a getter method to retrieve the employee salary
    public double getEmpSalary() {
        return empSalary;
    }

    // a getter method to fetch the designation of the employee
    public String getEmpDesignation() {
        return empDesignation;
    }

    @Override
    public String toString() {
        String res = "Employee Name: " + empName + ", EmpDesignation : " + empDesignation + ", Employee Salary : " + empSalary;

        return res;
    }
}

