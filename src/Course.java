public class Course {
    private String name;
    private String code;
    private int unit;
    private int grade;
    private int semester;

    static int numberOfCourse = 0;

    Course (String name, String code, int unit) {
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.grade = -1;
        this.semester = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
