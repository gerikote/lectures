package lecture2Homework;

public class Staff {
    private String staffID;
    private String firstName;
    private String lastName;
    private String email;

    public Staff(String staffID,String firstName,String lastName,String email)
    {
        this.staffID=staffID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
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
}
