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
}
