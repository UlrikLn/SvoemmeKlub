import java.util.*;

public class Cashier
{
    // Liste alle priser (Done)
    // hvem der er passive ()
    // Hvem der har betal og ikke betalt ()
    // Gøre folk passive (Done)
    // Huske at når vi sletter fra MemberList skal den også slette tilsvarende fra debtList
    private ArrayList<Member> debtList = new ArrayList<>();
    boolean sentinel = true;
    Scanner scan = new Scanner(System.in);
    Member member = new Member();

    Menu menu = new Menu();
    Registrering registrering = new Registrering();


    public void cashierMenu()
    {
        while ( sentinel )
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
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    System.out.println("Printer Kontigent Priser....");
                    member.sleep();
                    subcribtionPrices();
                    member.sleep();

                }
                else if ( tal == 2 )
                {
                        deficitCheck();
                }
                 else if ( tal == 3 )
                {
                        System.out.println("Printer Restance Liste....");
                        member.sleep();
                        member.sleep();
                        seeDeficit();
                }
                else if ( tal == 4 )
                {
                    deleteMember();

                }
                else if ( tal == 0 )
                {
                    System.out.println("Går Tilbage...");
                    member.sleep();
                    menu.menuLoop();
                    sentinel = false;

                }
                else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                    member.sleep();
                }
            }
            catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                member.sleep();
                scan.next();
            }


        }
    }

    public void deficitCheck()
    {
        if (member.getDebt() < 0)
        {
            debtList.add(member);
            System.out.println("Medlem tilføjet til restance liste");
        }
        else
        {
            System.out.println("Alle medlemmer har betalt, derfor ingen tilføjet)");
        }
    }
// Ikke done
    public void editDebt()
    {
        int input = scan.nextInt();

        member.setDebt(input);
    }

    public void debtListRemove()
    {
        if (member.getDebt() >= 0)
        {
            debtList.remove(member);
            System.out.println("Medlem fjernet fra restance liste");
        }
        else
        {
            System.out.println("Medlem har stadigvaek en indestaeende gaeld, derfor ikke fjernet");
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
        for ( Member value : debtList )
        {
            System.out.println(value);
        }
    }


    public void deleteMember()
    {
        sentinel = true;

        while(sentinel)
        {
            try
            {
                System.out.println("Indtast Telefonnummer på medlemmet");
                int prut = scan.nextInt();
                int id2 = member.getId();
                // Måske stort M med member??
                registrering.memberList.removeIf(member -> (id2 == prut));
                debtList.removeIf(member -> (id2 == prut));
                // == virker fordi man sammenlinger 2x int.
                System.out.println("Medlem Slettes");
                sentinel = false;
            }
            catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                member.sleep();
                scan.next();
            }
        }
    }

}
