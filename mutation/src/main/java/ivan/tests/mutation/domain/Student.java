package ivan.tests.mutation.domain;

public class Student {

    private final String name;
    private final String lastName;
    private final int age;
    private final Classroom classroom;

    public Student(String name, String lastName, int age, Classroom classroom) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.classroom = classroom;
    }

    public String getName() {
        return String.format("%s %s", name, lastName);
    }

    public int getAge() {
        return age;
    }

    public Classroom getClassroom() {
        return this.classroom;
    }

}
