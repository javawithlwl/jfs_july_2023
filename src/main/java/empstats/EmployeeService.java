package empstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> empList;

    public EmployeeService() {
        empList = loadEmployees();
    }


    // Sort employees by salary, firstName, lastName
    public void showEmployees() {
        List<Employee> sortedEmplist = empList
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getSalary).reversed()
                                .thenComparing(Employee::getFirstName)
                                .thenComparing(Employee::getLastName))
                .toList();
        sortedEmplist.forEach(ele->{
            System.out.println(ele.getFirstName()+" "+ele.getLastName()+" "+ele.getSalary());
        });
    }
    // Sort employee by salary get show top n employees
    public void showEmployees(int n){
            empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .skip(n)
                    .limit(n)
                    .forEach(System.out::println);
    }
    public void showEmployees(int pageNumber,int pageSize){
        empList.stream().sorted(Comparator.comparing(Employee::getEmpno))
                .skip(pageNumber * pageSize)
                .limit(pageSize)
                .forEach(System.out::println);
    }
    // Get top nth highest paid employee names
    public List<String> getNthHighestPaidEmployeeNames(int n){
        Map<Double, List<Employee>> retRes = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        Double salary = retRes.keySet().stream()
                .sorted(Comparator.comparingDouble(Double::doubleValue).reversed())
                .toList().get(n - 1);
           return retRes.get(salary).stream().map(e->e.getFirstName()+" "+e.getLastName()).toList();
    }

    @SneakyThrows
    private List<Employee> loadEmployees() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Employee>> empType = new TypeReference<List<Employee>>() {};
        return objectMapper.readValue(EmployeeService.class.getResourceAsStream("/emp_data.json"), empType);

    }
}
