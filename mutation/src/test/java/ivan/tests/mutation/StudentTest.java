package ivan.tests.mutation;

import ivan.tests.mutation.domain.Classroom;
import ivan.tests.mutation.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private final Student student = new Student(
            "Ivan",
            "Rodrigues",
            38,
            new Classroom("Math", List.of())
    );

    @Test
    void getNameTest() {
        assertEquals("Ivan Rodrigues", student.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(38, student.getAge());
    }
}
