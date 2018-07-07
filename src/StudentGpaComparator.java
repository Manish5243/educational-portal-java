import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGt().getTotalGPA() < o2.getGt().getTotalGPA()) {
            return 1;
        }
        if (o1.getGt().getTotalGPA() > o2.getGt().getTotalGPA()) {
            return -1;
        }
        return 0;
    }
}
