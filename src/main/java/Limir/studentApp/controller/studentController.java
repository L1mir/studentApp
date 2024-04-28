package Limir.studentApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Limir.studentApp.model.Student;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {
    @GetMapping
    public List<Student> findAllStudents () {
        return List.of(
                Student.builder().name("Student1").age(18).build(),
                Student.builder().name("Student1").age(18).build(),
                Student.builder().name("Student1").age(18).build()
        );
    }
}