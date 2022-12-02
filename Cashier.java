import java.util.*;

public class Cashier
{
    // Liste alle priser (Done)
    // hvem der er passive ()
    // Hvem der har betal og ikke betalt ()
    // Gøre folk passive (Done)
    private ArrayList<Member> debtList = new ArrayList<>();
    Member member = new Member();
    public void deficitCheck()
    {
        if (member.getSubscription() > 0)
        {
            debtList.add(member);
            System.out.println("Medlem tilføjet til restance liste");
        }
        else
        {
            System.out.println("Alle medlemmer har betalt :)");
        }
    }

    public void subcribtionPrices()
    {
        System.out.println("-----Kontingent priser-----");
        System.out.println("Under 18 år      =  1000 kr");
        System.out.println("Mellem 18-60 år  =  1600 kr");
        System.out.println("Over 60 år       =  1200 kr");
        System.out.println("Passiv medlem    =   500 kr");
        System.out.println("---------------------------");
    }

    public void seeDeficit()
    {
        for (int i = 0; i < debtList.size(); i++)
        {
            System.out.println(debtList.get(i));
        }
    }


    public void editMember()
    {

    }
}
