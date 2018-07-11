package examples.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee = EmployeeMapper.mapEmployee(employeeDto, employee);
        return employeeRepository.save(employee);
    }
}
