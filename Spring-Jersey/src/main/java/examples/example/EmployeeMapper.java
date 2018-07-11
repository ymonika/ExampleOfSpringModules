package examples.example;

public class EmployeeMapper {

    public static Employee mapEmployee(EmployeeDto employeeDto, Employee employee) {

        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        return employee;
    }
}
