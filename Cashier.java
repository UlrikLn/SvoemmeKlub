import java.util.*;
import java.util.function.Predicate;

public class Cashier
{
    // Liste alle priser (Done)
    // hvem der er passive ()
    // Hvem der har betal og ikke betalt ()
    // Gøre folk passive (Done)
    // Huske at når vi sletter fra MemberList skal den også slette tilsvarende fra debtList
    public  ArrayList<Member> debtList = new ArrayList<>();
    boolean sentinel = true;
    Scanner newScanner = new Scanner(System.in);
    Member member;
    Registration registration;
    Menu menu;



    public void cashierMenu()
    {
        while (sentinel)
        {
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
                int tal = newScanner.nextInt();
                if ( tal == 1 )
                {
                    System.out.println("Printer Kontigent Priser....");
                    //member.sleep();
                    subcribtionPrices();
                    //member.sleep();

                } else if ( tal == 2 )
                {
                    deficitAddToList(registration);
                } else if ( tal == 3 )
                {
                    System.out.println("Printer Restance Liste....");
                    //member.sleep();
                    //member.sleep();
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
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                newScanner.next();
            }


        }
    }


   public void deficitAddToList(Registration registration)
    {
        for (int i = 0; i < registration.memberList.size(); i++)
        {
            if(registration.memberList.get(i).getDebt() < 0)
            {
                //Ved ikke om det virker, måske skal member erstattes med i??
                //debtList.add((Member) registration.memberList.get(i));
                System.out.println("Medlem tilføjet til restance liste");
            }
            {
                System.out.println("Alle medlemmer har betalt, derfor ingen tilføjet)");
            }
        }
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
