package Classes.User;

import Classes.UserType;
import java.util.Date;

public class Trener extends AbstractUser{
    public Trener(int id,String firstName, String lastName,String password, Date dob){
        super( id, firstName, lastName,password, dob, UserType.TRENER);
    }
}
