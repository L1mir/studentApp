package Limir.studentApp.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String gender;
    private String name;
    private LocalDate dob;
    private int age;
    private String email;
}
