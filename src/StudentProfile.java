import java.util.Objects;

public class StudentProfile {

    private int studentID;
    private String firstname;
    private String lastname;
    private String gender;
    private String address;
    private String countryOfOrigin;
    private int age;
    private int yearoOfAdmission;

    StudentProfile () {
        this.studentID = createStudentID();
    }

    StudentProfile(String firstname, String lastname, String gender, String address, String countryOfOrigin, int age, int yearoOfAdmission) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.countryOfOrigin = countryOfOrigin;
        this.age = age;
        this.yearoOfAdmission = yearoOfAdmission;
        this.studentID = createStudentID();
    }

    private int createStudentID() {
        // Don't care about duplicate now
        int i = (int)(Math.random()*100000000);
        return i;
    }

    public String getName() {
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(this.gender, Constant.MALE)) {
            sb.append("Mr. ");
        } else {
            sb.append("Ms. ");
        }
        sb.append(this.firstname);
        sb.append(" ");
        sb.append(this.lastname);

        return sb.toString();
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearoOfAdmission(int yearoOfAdmission) {
        this.yearoOfAdmission = yearoOfAdmission;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getAge() {
        return age;
    }

    public int getYearoOfAdmission() {
        return yearoOfAdmission;
    }
}
