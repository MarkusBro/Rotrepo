package Classes.User;

import Classes.UserType;
import java.util.Date;


public class Admin extends AbstractUser {
    public Admin( int id, String firstName, String lastName, String password, Date dob) {
        super( id, firstName, lastName,password, dob, UserType.ADMIN);
    }
}
