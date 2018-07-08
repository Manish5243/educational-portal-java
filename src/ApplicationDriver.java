import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationDriver {

    static Student currentStudent;
    static int semester = 4;
    static CourseList courses;
    static StudentList students;

    public static void main(String[] args) throws InterruptedException {
        // register test data
        courses = registerCourses();
        students = registerStudents();

        // Login
        currentStudent = login(students);
        TimeUnit.SECONDS.sleep(1);

        // Main menu after login was correct
        run();
    }

    private static Student login(StudentList students) throws InterruptedException{
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
                if ((s = students.register()) != null) {
                    Screen.displaySuccessRegister(s);
                    TimeUnit.SECONDS.sleep(1);
                    break;
                }
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
                TimeUnit.SECONDS.sleep(1);
            }
        } while (s == null);

        Screen.displayLoginCorrect();

        return s;
    }

    private static void run() throws InterruptedException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String command = "";

        while (!Objects.equals(command, "10")) {
            TimeUnit.SECONDS.sleep(1);
            Screen.displayMainMenu();
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            doMenu(Integer.parseInt(command));
        }
    }

    private static void doMenu(int command) {
        switch (command) {
            case 1 :
                currentStudent.displayEnrolmentCertificate();
                break;
            case 2 :
                currentStudent.displayCourses();
                break;
            case 3 :
                currentStudent.displayTranscript();
                break;
            case 4 :
                currentStudent.displayGPA();
                break;
            case 5 :
                currentStudent.displayRank(students);
                break;
            case 6 :
                courses.displayAll(currentStudent);
                break;
            case 7 :
                students.displayAll();
                break;
        }

    }

    private  static CourseList registerCourses() {
        CourseList courses = new CourseList();

        courses.add(new Course("Objective-C", "MADP101", 3));
        courses.add(new Course("Object-Oriented Programming", "MADP102", 2));
        courses.add(new Course("Problem Solving", "MADP201", 1));
        courses.add(new Course("Project Management", "MADP202",3));
        courses.add(new Course("Java Programming", "MADP301", 3));
        courses.add(new Course("Web Development", "MADP302", 2));
        courses.add(new Course("Android Programming", "MADP401", 2));
        courses.add(new Course("iOS Applications", "MADP402", 3));

        return  courses;
    }

    private  static StudentList registerStudents() {
        StudentList students = new StudentList();
        StudentProfile sp1 = new StudentProfile("Takana", "Taro", "M", "1233 Burrard Street", "Japan", 20, 2018);
        StudentProfile sp2 = new StudentProfile("Ma", "Lin", "F", "233 Knight Street", "China", 24, 2018);
        StudentProfile sp3 = new StudentProfile("Williams", "John", "M", "#2904-2224 W.Hasting Street", "Canada", 29, 2017);
        Student s1 = new Student("tanaka", "123123", sp1, 1);
        Student s2 = new Student("linlin", "123123", sp2, 1);
        Student s3 = new Student("will", "123123", sp3, 1);

        s1.getGt().add(courses.get(1), 1, 80);
        s1.getGt().add(courses.get(5), 2, 45);
        s1.getGt().add(courses.get(6), 4, 64);
        s1.getGt().add(courses.get(7), 3, 70);

        s2.getGt().add(courses.get(1), 4, 90);

        s3.getGt().add(courses.get(0), 2, 80);
        s3.getGt().add(courses.get(1), 3, 65);
        s3.getGt().add(courses.get(2), 4, 77);

        students.add(s1);
        students.add(s2);
        students.add(s3);


        return  students;
    }
}
