public class Course {
    private String name;
    private int code;
    private int unit;
    private int grade;
    private int semester;

    static int numberOfCourse = 0;

    Course (String name, int unit) {
        this.name = name;
        this.code = setCode();
        this.unit = unit;
        this.grade = -1;
        this.semester = 0;
    }

    private static int setCode() {
        return numberOfCourse++;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
