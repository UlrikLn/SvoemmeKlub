import java.util.*;
import java.io.*;
import java.awt.Desktop;

public class Menu
{
    public static void main(String[] args)
    {
        menuLoop();
    }

    public static void menuLoop()
    {
        Teams team = new Teams();
        Coach coach = new Coach(team);
        Member member = new Member();
        Scanner scan = new Scanner(System.in);
        boolean sentinel = true;
        Desktop desktop = Desktop.getDesktop();
        Registration registration = new Registration(team);
        File memberFile = new File("members.txt");
        registration.newMember();
        Cashier cashier = new Cashier(registration);
        team.newTeams();


        while ( sentinel )
        {
            System.out.println("Vælg et tal fra 0-9 for at åbne funktioner:");
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
                if ( tal == 1 )
                {
                    registration.registerMember(member);

                } else if ( tal == 2 )
                {
                    registration.deleteMember(cashier);
                } else if ( tal == 3 )
                {
                   registration.editMember(team);
                } else if ( tal == 4 )
                {
                    System.out.println("Printer Liste....");
                    registration.sort();
                    registration.seeList();

                } else if ( tal == 5 )
                {
                    try
                    {
                        desktop.open(memberFile);
                        System.out.println("Dokumentet åbner");
                        System.out.println("----------------------------------------------------------");
                    } catch (Exception e)
                    {
                        System.out.println("**********************Error**********************");
                        System.out.println("                File doesn't open");
                        System.out.println("*************************************************");
                    }
                } else if ( tal == 6 )
                {
                    System.out.println("Åbner kasserer");
                    cashier.cashierMenu();
                } else if ( tal == 7 )
                {
                    System.out.println("Åbner træner");
                    coach.coachMenu();
                } else if ( tal == 0 )
                {
                    System.out.println("Lukker programmet");
                    sentinel = false;
                } else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                scan.next();
            }

        }
    }

}