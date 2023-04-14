package lecture2Homework;

public class UndergraduateStudents extends Students{
    private int yearLevel;

    public UndergraduateStudents(String studentID , String firstName, String lastName , String email, String major, int yearLevel)
    {
        super(studentID,firstName,lastName,email,major);
        this.yearLevel=yearLevel;
    }

    public int getYearLevel()
    {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel)
    {
        this.yearLevel=yearLevel;
    }
}
