import java.util.ArrayList;

public class GeneralTranscript {
    private ArrayList<Course> courses;

    GeneralTranscript() {
        courses = new ArrayList<>();
    }

    public int getTakenCourses() {
        return courses.size();
    }

    public int getCurrentTakenCourses() {
        int count = 0;
        for (Course c : this.courses) {
            if (c.isSemester()) {
            count++;
            }
        }

        return count;
    }

    public void add(Course c) {
        c.setSemester(ApplicationDriver.semester);
        courses.add(c);
    }

    // For test
    public void add(Course c, int semester, int grade) {
        Course course = new Course(c.getName(), c.getCode(), c.getUnit());
        course.setSemester(semester);
        course.setGrade(grade);
        courses.add(course);
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

    public void displayAllGrade() {
        int i = 1;
        String str = "";
        for (Course c : this.courses) {
            str = i + ") " + c.getCode() + " : " + c.getName() + " : " + c.getGrade();
            if (c.isSemester()) {
                str += " " + Constant.CURRENT_SEMESTER;
            }
            System.out.println(str);
            i++;
        }
    }

    public void displayCurrentGrade() {
        int i = 1;
        String str = "";
        for (Course c : this.courses) {
            if (c.isSemester()) {
                str = i + ") " + c.getCode() + " : " + c.getName() + " : " + c.getGrade() + " " + Constant.CURRENT_SEMESTER;
                System.out.println(str);
                i++;
            }
        }
    }

    public double getTotalGPA() {
        double total = 0;
        for (Course c : this.courses) {
            total += c.getGrade();
        }

        return total/getTakenCourses();
    }

    public double getCurrentGPA() {
        double total = 0;

        for (Course c : this.courses) {
            if (c.isSemester()) {
                total += c.getGrade();
            }
        }

        return total/getCurrentTakenCourses();
    }
}
