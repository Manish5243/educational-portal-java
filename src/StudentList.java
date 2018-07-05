import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentList {
    private List<Student> students;

    StudentList() {
        students = new ArrayList<>();
    }

    void add (Student s) {
        students.add(s);
    }

    Student login(String username, String password) {
        Student s = new Student("suige", "suige");
        if (Objects.equals(username, "suige")) {
            return s;
        }
        return null;
    }
}
