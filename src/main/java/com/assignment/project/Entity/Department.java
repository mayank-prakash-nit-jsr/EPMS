package com.assignment.project.Entity;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Double budget;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
