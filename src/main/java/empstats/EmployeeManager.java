package empstats;

public class EmployeeManager {

    public static void main(String[] args) {

            EmployeeService employeeService = new EmployeeService();
            employeeService.showEmployees(0,20);

            employeeService.getNthHighestPaidEmployeeNames(2).forEach(System.out::println);
    }
}
