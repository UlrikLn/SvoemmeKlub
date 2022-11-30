import java.util.*;

public class Cashier
{
    Member member;

    public static int CalulateAge(Date member.getBirthday())
    {
        Calendar getBirthday = Calendar.getInstance();
        getBirthday.setTime(getBirthday);
        Calendar Today = Calendar.getInstance();

        int ageDiff = iDag.get(Calendar.YEAR) - fozdato.get(Calendar.YEAR);

        if (iDag.get(Calendar.MONTH) < fozdato.get(Calendar.MONTH)) {
            aarsForskel--;
        } else {
            if (iDag.get(Calendar.MONTH) == fozdato.get(Calendar.MONTH) && iDag.get(Calendar.DAY_OF_MONTH) < fozdato.get(Calendar.DAY_OF_MONTH)) {
                aarsForskel--;
            }

        }
        return aarsForskel;
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
