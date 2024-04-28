package Limir.studentApp.repository;

import Limir.studentApp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentDAO {

    private final List <Student> students = new ArrayList<>();

    public List<Student> findAllStudents() {
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student findByName(String name) {
         return students.stream().filter(student -> student.getName().equals(name)).findFirst().orElse(null);
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, students.size())
                .filter(index -> students.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            students.set(studentIndex, student);
            return student;
        }
        return null;
    }

    public void deleteStudent(String name) {
        var student = findByName(name);
        if (student != null) {
            students.remove(student);
        }
    }
}
