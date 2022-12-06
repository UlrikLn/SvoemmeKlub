import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.awt.Desktop;

public class Menu
{
    // Vi skal lave en ny Class der hedder Delfinen hvor vores main() skal være
    // så vi laver en metode herinde, der bare hedder start() som så kører vore "menu" while loop.
    // og så inde i vores main() der kalder laver vi en Menu menu = new Menu og kalder menu.start().

        Cashier cashier = new Cashier();
        Coach coach = new Coach();
        Scanner scan = new Scanner(System.in);
        boolean sentinel = true;
        Desktop desktop = Desktop.getDesktop();
        Member member = new Member();
        Registrering registrering = new Registrering();
        File memberFile = new File("members.txt");
    public void menuLoop()
    {
        while (sentinel)
        {
            System.out.println("Vaelg et tal fra 0-9 for at abne funktioner:");
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
                    cashier.deleteMember();
                }
                else if (tal == 3)
                {
                    System.out.println("Ikke færdigt gjordt endnu");
                }
                else if (tal == 4)
                {
                    System.out.println("Printer Liste....");
                    member.sleep();
                    member.sleep();
                    registrering.seeList();
                }
                else if (tal == 5)
                {
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
                    System.out.println("Aabner kasserer");
                    cashier.cashierMenu();
                    sentinel = false;
                }
                else if (tal == 7)
                {
                    System.out.println("Aabner træner");
                    coach.coachMenu();
                    sentinel = false;
                }
                else if (tal == 0)
                {
                    System.out.println("Lukker programmet");
                    sentinel = false;
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
    }
}