import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Student {
    private Account account;
    private StudentProfile studentProfile;
    private int numberOfYear;
    private GeneralTranscript gt;

    Student() {
        this.gt = new GeneralTranscript();
    }

    Student (String username, String password, StudentProfile sp, int numberOfYear) {
        this.account = new Account(username, password);
        this.studentProfile = sp;
        this.numberOfYear = numberOfYear;
        this.gt = new GeneralTranscript();
    }

    public Account getAccount() {
        return this.account;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public GeneralTranscript getGt() {
        return gt;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setStudentProfile(StudentProfile sp) {
        this.studentProfile = sp;
    }


    boolean register() {
        String username="", password="";
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Please enter a username [At least 6 characters]:");
        try {
            username = br.readLine();
            account.setUsername(username);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter a username [At least 6 characters with at least one digit]:");
        try {
            password = br.readLine();
            account.setPassword(password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public void displayEnrolmentCertificate() {
        String subject = "";
        StudentProfile sp = this.getStudentProfile();
        if (Objects.equals(sp.getGender(), Constant.MALE)) {
            subject = "he";
        } else {
            subject = "she";
        }

        System.out.println();
        if (Objects.equals(sp.getGender(), Constant.MALE)) {
            System.out.println("Dear Sir,");
        } else {
            System.out.println("Dear Madam,");
        }
        System.out.println();

        System.out.print("This is to certify that ");
        System.out.print(sp.getName());
        System.out.print(" with student id ");
        System.out.print(sp.getStudentID());
        System.out.print(" is a student at semester ");
        System.out.print(ApplicationDriver.semester);
        System.out.println(" at CICCC.");

        System.out.print(uppeCaseFirst(subject));
        System.out.print(" was admitted to our college in ");
        System.out.print(sp.getYearoOfAdmission());
        System.out.print(" and has taken ");
        System.out.print(this.gt.getTakenCourses());
        System.out.print(" course(s) so far. Currently ");
        System.out.print(subject);
        System.out.print(" resides at ");
        System.out.print(sp.getAddress());
        System.out.println(".");
        System.out.println();
        System.out.println("If you have any question, please don’t hesitate to contact us.");
        System.out.println("Thanks,");
        System.out.println("William,");
        System.out.println();
    }

    public void displayCourses() {
        StudentProfile sp = this.getStudentProfile();
        System.out.println();
        System.out.print("Hi ");
        System.out.print(sp.getName());
        System.out.println(",");
        System.out.println("You have taken the following courses so far:");
        this.gt.displayAll();
        System.out.println();
    }

    public void displayTranscript() {
        StudentProfile sp = this.getStudentProfile();
        System.out.println();
        System.out.print("Hi ");
        System.out.print(sp.getName());
        System.out.println(",");
        System.out.println("Here is your general transcript:");
        this.gt.displayAllGrade();
        System.out.print("YOUR GPA IS: ");
        System.out.println(String.format("%1$.2f", this.gt.getTotalGPA()));
        System.out.println();
        System.out.println("Here is your current semester transcript:");
        this.gt.displayCurrentGrade();
        System.out.print("YOUR Current Semester GPA IS: ");
        System.out.println(String.format("%1$.2f", this.gt.getCurrentGPA()));
        System.out.println();
    }

    public void displayGPA() {
        StudentProfile sp = this.getStudentProfile();
        System.out.println();
        System.out.print("Hi ");
        System.out.print(sp.getName());
        System.out.println(",");
        System.out.print("Your overall GPA is ");
        System.out.println(String.format("%1$.2f", this.gt.getTotalGPA()));
        System.out.print("Your current semester’s GPA is ");
        System.out.println(String.format("%1$.2f", this.gt.getCurrentGPA()));
        System.out.println();
    }


    private static String uppeCaseFirst(String str) {
        String ret = str.toUpperCase().substring(0, 1) + str.toLowerCase().substring(1);
        return ret;
    }
}
