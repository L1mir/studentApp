package Limir.studentApp.service;

import Limir.studentApp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents ();
    void saveStudent(Student student);
    Student findByName (String name);
    Student upadteStudent(Student student);
    void deleteStudent(String name);
}
