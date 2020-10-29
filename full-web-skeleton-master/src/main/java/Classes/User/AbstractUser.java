package Classes.User;

import Classes.UserType;
import java.util.Date;

public class AbstractUser {
    /*
    field
    */
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String password;
    protected Date dob;
    protected UserType userType;
    /*
    Constructor
    */
    public AbstractUser(int id, String firstName, String lastName, String password, Date dob, UserType userType){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this. password = password;
        this.dob = dob;
        this.userType= userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
