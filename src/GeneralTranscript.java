import java.util.ArrayList;

public class GeneralTranscript {
    private ArrayList<Course> courses;

    GeneralTranscript() {
        courses = new ArrayList<>();
    }

    public int getTakenCourses() {
        return courses.size();
    }

    public void add(Course c) {
        c.setSemester(ApplicationDriver.semester);
        courses.add(c);
    }

    // For test
    public void add(Course c, int semester) {
        c.setSemester(semester);
        courses.add(c);
    }

    public void displayAll() {
        int i = 1;
        String str = "";
        for (Course c : this.courses) {
            str = i + ") " + c.getCode() + " : " + c.getName();
            if (c.isSemester()) {
                str += " " + Constant.CURRENT_SEMESTER;
            }
            System.out.println(str);
            i++;
        }
    }
}
