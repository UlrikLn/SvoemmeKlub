import java.util.*;
import java.util.function.Predicate;

public class Cashier
{

    public  ArrayList<Member> debtList = new ArrayList<>();
    boolean sentinel = true;
    Scanner scan = new Scanner(System.in);
    Member member;
    Registration registration;
    Menu menu;
    public Cashier(Registration registration)
    {
        this.registration = registration;
    }

    public void cashierMenu()
    {
        debtList.add(new Member(4, "Kvinde", "Lotte", "Lehun", 22, 1600, "Competitor", true, 2000));
            System.out.println("Vælg et tal fra 0-9 for at åbne funktioner:");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | Se Kontigent Priser");
            System.out.println("| 2 | Tilføj Medlemmer til Restance");
            System.out.println("| 3 | Se Medlemmer i Restance");
            System.out.println("| 4 | Slet Medlem");
            System.out.println("| 0 | Gå Tilbage");
            System.out.println("----------------------------------------------------------");
            try
            {
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    System.out.println("Printer Kontigent Priser....");
                    subcribtionPrices();

                } else if ( tal == 2 )
                {
                    deficitAddToList();

                } else if ( tal == 3 )
                {
                    System.out.println("Printer Restance Liste....");
                    seeDeficit();
                } else if ( tal == 4 )
                {

                } else if ( tal == 0 )
                {
                    System.out.println("Går Tilbage...");
                    Menu.menuLoop();
                    sentinel = false;

                } else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                }
            } catch (Exception e)
            {
                System.out.println("Der opsted en fejl prøver igen");
                scan.next();
            }


    }
   public void deficitAddToList()
    {
        for (int i = 0; i < registration.memberList.size(); i++)
        {
            if(registration.memberList.get(i).getDebt() > 0)
            {
                debtList.add(registration.memberList.get(i));
                System.out.println("Medlem tilføjet til restance liste");
            }
            else
            {
                System.out.println("Medlem: " + " [ " + i + " ] " + " har betalt");
            }
        }
        cashierMenu();
    }

    public void debtListRemove()
    {
        for (int i = 0; i < debtList.size(); i++)
        {
            if(debtList.get(i).getDebt() <= 0)
            {
                debtList.remove(i);
                System.out.println("Medlem fjernet fra restance liste");
            }
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
        for ( Member member1 : debtList )
        {
            System.out.println(member1);
        }
    }

}
