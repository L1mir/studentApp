package Limir.studentApp.service.Implementation;

import Limir.studentApp.model.Student;
import Limir.studentApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImplStudentService implements StudentService {

    private final ImplStudentService repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Student upadteStudent(Student student) {
        return repository.upadteStudent(student);
    }

    @Override
    public void deleteStudent(String name) {
        repository.deleteStudent(name);
    }
}
