import java.util.*;

public class Cashier
{
    // Liste alle priser (Done)
    // hvem der er passive ()
    // Hvem der har betal og ikke betalt ()
    // Gøre folk passive (Done)
    private ArrayList<Member> debtList = new ArrayList<>();
    boolean sentinel = true;
    Scanner scan = new Scanner(System.in);
    Member member = new Member();

    while (sentinel)
    {
        System.out.println("Vaelg et tal fra 0-9 for at aabne funktioner:");
        System.out.println("----------------------------------------------------------");
        System.out.println("| 1 | Opret nyt medlem");
        System.out.println("| 2 | Slet medlem");
        System.out.println("| 3 | Rediger medlem");
        System.out.println("| 4 | Print alle medlemmer i programmet");
        System.out.println("| 5 | Vis alle medlemmer i databasen");
        System.out.println("| 6 | Login som kasserer");
        System.out.println("| 7 | Login som coach");
        System.out.println("| 0 | Afslut program");
        System.out.println("----------------------------------------------------------");

        try
        {
            int tal = scan.nextInt();
            if (tal == 1)
            {
                sentinel = false;
                System.out.println("Aabner 1");
            }
            else if (tal == 2)
            {
                sentinel = false;
                System.out.println("Aabner 2");
            }
            else if (tal == 3)
            {
                sentinel = false;
                System.out.println("Aabner 3");
            }
            else if (tal == 4)
            {
                sentinel = false;
                System.out.println("Aabner 4");
            }
            else if (tal == 5)
            {
                //sentinel = false;
                try
                {
                    desktop.open(memberFile);
                    System.out.println("Dokumentet aabner");
                    System.out.println("----------------------------------------------------------");
                    member.sleep();
                }
                catch (Exception e)
                {
                    System.out.println("**********************Error**********************");
                    System.out.println("                File doesn't open");
                    System.out.println("*************************************************");
                }
            }
            else if (tal == 6)
            {
                sentinel = false;
                System.out.println("Aabner kasserer");
            }
            else if (tal == 7)
            {
                sentinel = false;
                System.out.println("Aabner træner");
            }
            else if (tal == 0)
            {
                sentinel = false;
                System.out.println("Lukker programmet");
            }
            else
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                member.sleep();
            }
        }
        catch(Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
            member.sleep();
            scan.next();
        }

    }
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
