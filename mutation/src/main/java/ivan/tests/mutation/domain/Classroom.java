package ivan.tests.mutation.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Classroom {

    private final String name;

    private final List<Student> students;

    public Classroom(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Set<String> listAllStudentsByName() {
        return students.stream().map(Student::getName).collect(Collectors.toSet());
    }

    public void notifyStudents() {
        int total= students.size();
        int counter = 0;
        while(counter < total) {
            //do something
            counter++;
        }
    }

}
