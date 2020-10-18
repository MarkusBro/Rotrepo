package Classes.User;

import Classes.UserType;
import java.util.Date;

public class AbstractUser {
    /*
    field
    */
    protected String firstName;
    protected String lastName;
    protected Date dob;
    protected UserType userType;
    /*
    Constructor
    */
    public AbstractUser(String firstName, String lastName, Date dob, UserType userType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.userType= userType;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
