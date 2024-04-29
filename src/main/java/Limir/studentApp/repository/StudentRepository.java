package Limir.studentApp.repository;

import Limir.studentApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByName(String name);
    Student findByName(String name);
}
