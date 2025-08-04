package com.assignment.project.Entity;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary Key

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;  // Unique

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;  // FK to Department

    private LocalDate dateOfJoining;

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;  // Self-reference FK

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PerformanceReview> performanceReviews;

    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Project> projects;
}
