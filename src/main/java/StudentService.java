import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public Optional<Student> findStudentById(String id) {
        return repo.findStudentById(id);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }
}
