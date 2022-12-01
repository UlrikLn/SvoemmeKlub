import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exerciser extends Member
{
    public Exerciser(int id, String gender, String firstName, String surname, Date birthday, int subscription, String memberType, boolean membershipActive)throws ParseException
    {
        super(id, gender, firstName, surname, birthday, subscription, memberType, membershipActive);
    }


}
