import java.util.ArrayList;
import java.util.List;

public class School {
    private static final String name = "BFH";
    List<Teacher> teachers;
    List<Student> students;
    School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private Teacher findTeacher(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String schoolsDetails = "The teachers at the " + name + " are:\n";

        for (Teacher teacher : teachers) {
            schoolsDetails += teacher.toString() + "\n";
        }
        schoolsDetails += "\n\n" + "The students at the " + name + " are:\n";
        for (Student student : students) {
            schoolsDetails += student.toString() + "\n";
        }
        return schoolsDetails;
    }
}
