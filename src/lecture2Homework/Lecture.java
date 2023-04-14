package lecture2Homework;

public class Lecture extends Course {
    private Staff lecturer;

    public Lecture(String courseCode,String courseName,String [] prerequisites,int maxStudents,Staff lecturer)
    {
        super(courseCode,courseName,prerequisites,maxStudents);
        this.lecturer=lecturer;
    }

    public Staff getLecturer() {
        return lecturer;
    }

    public void setLecturer(Staff lecturer) {
        this.lecturer = lecturer;
    }


}
