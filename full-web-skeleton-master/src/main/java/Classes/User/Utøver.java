package Classes.User;

import java.util.Date;
import Classes.UserType;

public class Utøver extends AbstractUser{
    public Utøver(int id,String firstName, String lastName, String password, Date dob){
        super(id, firstName,lastName, password,dob, UserType.UTØVER);
    }
}
