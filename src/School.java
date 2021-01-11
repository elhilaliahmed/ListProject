import java.util.ArrayList;
import java.util.List;

public class School extends Person {

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

    @Override
    public String toString() {
        String schoolsDetails = "";

        for (Teacher teacher : teachers) {
            schoolsDetails += teacher.toString() + "\n";
        }
        schoolsDetails += "\n\n";
        for (Student student : students) {
            schoolsDetails += student.toString();
        }
        return schoolsDetails;
    }
}
