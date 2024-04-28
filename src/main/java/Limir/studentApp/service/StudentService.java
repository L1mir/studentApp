package Limir.studentApp.service;

import Limir.studentApp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents ();
    Student saveStudent(Student student);
    Student findByName (String name);
    Student upadteStudent(Student student);
    void deleteStudent(String name);
}
