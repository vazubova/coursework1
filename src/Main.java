public class Main {
    public static void main(String[] args) {


        EmployeeBook employeeBook = new EmployeeBook(10);
        for (int i = 1, department = 1; i <= 10; i++) {
            double salary = 10000;

            Employee employee = new Employee("firstName" + i, "MiddleName" + i, "LastName" + i, department, salary * i);
            department++;
            if (department == 6) {
                department = 1;

            }

            employeeBook.addEmployee(employee);


        }

        employeeBook.printAllEmployees();
        System.out.println();
        System.out.println(employeeBook.salaryOfAllEmployees());
        System.out.println();
        System.out.println(employeeBook.minSalary());
        System.out.println();
        System.out.println(employeeBook.maxSalary());
        System.out.println();
        System.out.println(employeeBook.averageSalary());
        System.out.println();
        employeeBook.fullName();
        System.out.println();
        employeeBook.IndexSalary(10);
        System.out.println();
        System.out.println(employeeBook.employeeWithMinSalaryPerDepartment(2));
        System.out.println();
        System.out.println(employeeBook.maxSalaryInDepartment(3));
        System.out.println();
        System.out.println(employeeBook.salaryOfAllEmployeesInDepartment(1));
        System.out.println();
        System.out.println(employeeBook.averageSalaryInDepartment(4));
        System.out.println();
        employeeBook.IndexSalaryInDepartment(10, 5);
        System.out.println();
        employeeBook.fullNameOfDepartment(3);
        System.out.println();
        employeeBook.lessSalary(20000);
        System.out.println();
        employeeBook.mostSalary(30000);
        System.out.println();
        employeeBook.addEmployee(new Employee("fistName11", "middleName11", "LastName11", 3, 25000));
        System.out.println();
        employeeBook.deleteEmployeeId(2);
        System.out.println();
        employeeBook.printAllEmployees();
        employeeBook.addEmployee(new Employee("fistName", "middleName", "LastName", 3, 25000));
        System.out.println();
        employeeBook.printAllEmployees();
        System.out.println();
        System.out.println(employeeBook.getEmployeeId(3));


    }


}