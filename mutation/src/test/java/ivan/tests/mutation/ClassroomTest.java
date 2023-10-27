package ivan.tests.mutation;

import ivan.tests.mutation.domain.Classroom;
import ivan.tests.mutation.domain.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {

    private final Student student = new Student(
            "Ivan",
            "Rodrigues",
            38,
            new Classroom("Math", List.of())
    );
    private final Classroom classroom = new Classroom("Math", List.of(student, student, student));

    @Test
    void getNameTest() {
        assertNotNull(classroom.getName());
    }
    @Test
    void listAllStudentsByName () {
        assertInstanceOf(Set.class,classroom.listAllStudentsByName());
        assertEquals(1, classroom.listAllStudentsByName().size());
    }

    @Test
    void notifyStudents () {
        classroom.notifyStudents();
    }

}
