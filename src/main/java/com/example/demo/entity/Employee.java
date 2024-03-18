//package com.example.demo.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Entity
//@Transactional
//@Data
//@NoArgsConstructor
//@Table(name = "employee_details")
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "emp_id")
//    private Long empId;
//    private String empName;
//    private Integer empAge;
//
//    @OneToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "fk_emp_id")
//    @JoinColumn(name = "fk_add_id")
//    private Address address;
//
//
//}
