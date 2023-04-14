package lecture2Homework;

public class GraduateStudents extends Students {
    private String thesisTopic;

    public GraduateStudents(String studentID,String firstName,String lastName , String email, String major,String thesisTopic )
    {
        super(studentID,firstName,lastName,email,major);
        this.thesisTopic=thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
}
