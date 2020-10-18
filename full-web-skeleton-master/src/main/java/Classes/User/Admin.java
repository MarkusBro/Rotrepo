package Classes.User;

import Classes.UserType;
import java.util.Date;


public class Admin extends AbstractUser {
    public Admin(String firstName, String lastName, Date dob) {
        super(firstName, lastName, dob, UserType.ADMIN);
    }
}
