import java.util.*;

public class Cashier
{
    public static int CalulateAge(Member member)
    {
        Date age = member.getBirthday();
        Calendar age = Calendar.getInstance();
        age.setTime(age);
        Calendar today = Calendar.getInstance();

        int ageDiff = today.get(Calendar.YEAR) - age.get(Calendar.YEAR);

        if (today.get(Calendar.MONTH) < age.get(Calendar.MONTH)) {
            ageDiff--;
        } else {
            if (today.get(Calendar.MONTH) == age.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < age.get(Calendar.DAY_OF_MONTH)) {
                ageDiff--;
            }

        }
        return ageDiff;
    }
        if (udregnAlder(fozdato) < 18) {
        kontingent = 1000;
        } else if (udregnAlder(fozdato) > 60) {
        kontingent = 1200;
        } else {
        kontingent = 1600;
        }

    public void seKontingent()
    {
        System.out.println("Kontingent priser");
        System.out.println("Under 18 år      =  1000 kr");
        System.out.println("Mellem 18-60 år  =  1600 kr");
        System.out.println("Over 60 år       =  1200 kr");
        System.out.println("Passiv medlem    =   500 kr");
        System.out.println("");
    }
}
