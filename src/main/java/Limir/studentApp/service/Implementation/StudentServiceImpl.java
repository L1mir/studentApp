package Limir.studentApp.service.Implementation;

import Limir.studentApp.model.Student;
import Limir.studentApp.repository.StudentRepository;
import Limir.studentApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student upadteStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String name) {
        studentRepository.deleteByName(name);
    }
}
