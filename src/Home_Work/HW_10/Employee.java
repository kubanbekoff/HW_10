package Home_Work.HW_10;

public class Employee {
    private String name;
    private double BaseSalary;
    public double Salary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.BaseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public double getSalary() {
        return Salary;
    }




}
