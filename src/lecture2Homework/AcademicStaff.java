package lecture2Homework;

public class AcademicStaff extends Staff {
    private Course [] courses;

    public AcademicStaff(String staffID,String firstName,String lastName,String email,Course [] courses)
    {
        super(staffID,firstName,lastName,email);
        this.courses=courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
