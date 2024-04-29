package Limir.studentApp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String gender;
    private String name;
    private LocalDate dob;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;
}
