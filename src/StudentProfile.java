public class StudentProfile {
    private int studentID;

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

    private String firstname;
    private String lastname;
    private String gender;
    private String address;
    private String countryOfOrigin;
    private int age;
    private int yearoOfAdmission;
}
