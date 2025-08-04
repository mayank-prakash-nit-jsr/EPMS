package com.assignment.project.ServiceImpl;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getFilteredEmployees(Integer score, LocalDate reviewDate,
                                               List<Long> departmentIds, List<Long> projectIds) {
        // TODO: Write custom query using JPA Criteria API
        return employeeRepository.findAll();  // placeholder
    }

    public Employee getEmployeeDetails(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}