package lecture2Homework;

public class Students {
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String major;

    public Students(String studentID,String firstName,String lastName,String email , String major)
    {
        this.studentID=studentID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.major=major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
