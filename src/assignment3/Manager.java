package assignment3;

public class Manager extends Employee{
    private String departmentName;
    public Manager(int empId, String name, String ssn, double salary,String departmentName) {
        super(empId, name, ssn, salary);
    }



    public String getDepartmentName(){
        return departmentName;
    }
}
