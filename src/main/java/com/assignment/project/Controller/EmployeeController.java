package com.assignment.project.Controller;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getFilteredEmployees(
            @RequestParam(required = false) Integer score,
            @RequestParam(required = false) LocalDate reviewDate,
            @RequestParam(required = false) List<Long> departmentIds,
            @RequestParam(required = false) List<Long> projectIds) {

        return employeeService.getFilteredEmployees(score, reviewDate, departmentIds, projectIds);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable Long id) {
        return employeeService.getEmployeeDetails(id);
    }
}
