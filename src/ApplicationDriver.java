import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationDriver {

    public static void main(String[] args) throws InterruptedException {
        StudentList students = new StudentList();
        Student s1 = new Student("suige", "123123");
        students.add(s1);

        Student currentStudent;

        // Login
        currentStudent = login(students);
        TimeUnit.SECONDS.sleep(1);

        // Main menu after login was correct
        run();
    }

    private static Student login(StudentList students) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String username="", password="";
        Student s;

        do {
            Screen.displayLogin();

            try {
                username = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (Objects.equals(username, Constant.REGISTER)) {
                Screen.displayRegister();
            } else {
                try {
                    password = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            s = students.login(username, password);
            if (s == null) {
                Screen.displayLoginWrong();
            }
        } while (s == null);

        Screen.displayLoginCorrect();

        return s;
    }

    private static void run() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String command = "";

        while (!Objects.equals(command, "10")) {
            Screen.displayMainMenu();
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
