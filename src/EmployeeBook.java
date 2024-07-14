public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee deleteEmployeeId(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return employees[i];
            }
        }
        return null;
    }

    public Employee getEmployeeId(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }

        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double salaryOfAllEmployees() {
        double salaryOfAllEmployees = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryOfAllEmployees += employee.getSalary();
            }
        }
        return salaryOfAllEmployees;
    }

    public Employee minSalary() {
        Employee employeeWithMinSalary = null;
        double minSalary = -1d;

        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public Employee maxSalary() {
        Employee employeeWithMaxSalary = null;
        double maxSalary = -1d;

        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                if (maxSalary < 0 || maxSalary > 0 && maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public double averageSalary() {
        int countOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countOfEmployees++;
            }
        }
        if (countOfEmployees == 0) {
            return countOfEmployees;
        }

        return salaryOfAllEmployees() / countOfEmployees;
    }

    public void fullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }

    }

    public void IndexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary / 100) * percent);
            }
        }

    }

    public Employee employeeWithMinSalaryPerDepartment(int department) {
        Employee employeeWithMinSalary = null;
        double minSalary = -1d;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                if (minSalary < 0 || minSalary > 0 && minSalary > currentSalary) {
                    minSalary = currentSalary;
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;

    }

    public Employee maxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        double maxSalary = -1d;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                if (maxSalary < 0 || maxSalary > 0 && maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public double salaryOfAllEmployeesInDepartment(int department) {
        double salaryOfAllEmployees = 0d;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                salaryOfAllEmployees += employee.getSalary();
            }
        }
        return salaryOfAllEmployees;
    }

    public double averageSalaryInDepartment(int department) {
        int countOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                countOfEmployees++;
            }
        }
        if (countOfEmployees == 0) {
            return countOfEmployees;
        }

        return salaryOfAllEmployees() / countOfEmployees;
    }

    public void fullNameOfDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }

    }

    public void IndexSalaryInDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + (currentSalary / 100) * percent);
            }
        }

    }

    public void lessSalary(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("id " + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getSalary());
            }
        }
    }

    public void mostSalary(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("id " + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getSalary());
            }
        }
    }


}

