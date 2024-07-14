import java.util.Objects;

public class Employee {


    private final int id;

    private String lastName;
    private String firstName;
    private String middleName;
    private int department;
    private double salary;
    private static int counter = 0;


    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double getId() {
        return id;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Employee employee = (Employee) object;
        return id == employee.id
                && department == employee.department
                && Double.compare(salary, employee.salary) == 0
                && Objects.equals(firstName, employee.firstName)
                && Objects.equals(middleName, employee.middleName)
                && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, department, salary);
    }

    @Override
    public String toString() {
        return "Employee( " + "id " + id + " " + lastName + " " + firstName + " " + middleName + " зарплата " + salary + " депаратмент " + department + " id " + id + ")";
    }


}






