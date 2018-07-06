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
        Student s = this.searchStudent(username);

        if (s != null) {
            if (Objects.equals(s.getAccount().getPassword(), password)) {
                return s;
            }
        }
        return null;
    }

    Student searchStudent(String username) {
        for (Student s : this.students) {
            if (Objects.equals(s.getAccount().getUsername(), username)) {
                return s;
            }
        }
        return null;
    }
}
