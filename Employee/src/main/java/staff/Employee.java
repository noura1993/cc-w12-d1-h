package staff;

public abstract class Employee {
    private String name;
    private String NI_number;
    private double salary;

    public Employee(String name, String NI_number, double salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNI_number() {
        return this.NI_number;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
