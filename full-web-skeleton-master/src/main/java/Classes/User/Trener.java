package Classes.User;

import Classes.UserType;
import java.util.Date;

public class Trener extends AbstractUser{
    public Trener(String firstName, String lastName, Date dob){
        super(firstName, lastName, dob, UserType.TRENER);
    }
}
