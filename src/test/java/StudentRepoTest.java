import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentRepoTest {

    @Test
    public void findStudentByIdTest() {
        StudentRepo repo = new StudentRepo();
        String id = "cjgilh";

        assertThrows(StudentNotFoundException.class, () -> {
            repo.findStudentById(id);
        });
    }
}