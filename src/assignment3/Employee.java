package assignment3;

public class Employee {
    private  int empId;
    private String name;
    private  String ssn;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }




    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        if(!(increase<=0)){
            this.salary += increase;
        }else{
            System.out.println("negative of zero salary will not be increased ");
        }


    }

    public void printEmployee() {
        System.out.println("empId:" + empId + "name:" + name + " ssn:" + ssn + " salary:" + salary);
    }
}
