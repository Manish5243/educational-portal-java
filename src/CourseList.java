import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private List<Course> courses;

    CourseList() {
        courses = new ArrayList<>();
    }

    public void add (Course c) {
        courses.add(c);
    }

    public Course get (int i) {
        return this.courses.get(i);
    }

    public void displayAll(Student student) {
        int i = 1;
        String str = "";
        GeneralTranscript gt = student.getGt();
        Course tempc;

        System.out.println();
        System.out.println("The following courses are offered in CICCC:");
        for (Course c : this.courses) {
            str = i + ") " + c.getCode() + " : " + c.getName() + " : " + c.getUnit() + " unit(s)";
            tempc = gt.getTakenCourse(c.getCode());
            if (tempc != null) {
                str += String.format(" [Taken at semester %d]", tempc.getSemester());
            } else {
                str += " [Not taken]";
            }
            System.out.println(str);
            i++;

        }
        System.out.println();
    }

}
