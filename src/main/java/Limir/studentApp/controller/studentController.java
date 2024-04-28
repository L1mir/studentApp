package Limir.studentApp.controller;

import Limir.studentApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.web.bind.annotation.*;
import Limir.studentApp.model.Student;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class studentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents () {
        return studentService.findAllStudents();
    }

    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/email")
    public Student findByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student) {
        return studentService.upadteStudent(student);
    }

    @DeleteMapping("delete_student/{name}")
    public void deleteStudent(@PathVariable String name) {
        studentService.deleteStudent(name);
    }
}