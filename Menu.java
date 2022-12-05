import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.awt.Desktop;

public class Menu
{
    public static ArrayList<Member> memberList = new ArrayList<>();

    // Vi skal lave en ny Class der hedder Delfinen hvor vores main() skal være
    // så vi laver en metode herinde, der bare hedder start() som så kører vore "menu" while loop.
    // og så inde i vores main() der kalder laver vi en Menu menu = new Menu og kalder menu.start().

    public static void main(String[] args)
    {
        Cashier cashier = new Cashier();
        Coach coach = new Coach();
        Scanner scan = new Scanner(System.in);
        Member member = new Member();
        boolean sentinel = true;
        Desktop desktop = Desktop.getDesktop();
        File memberFile = new File("members.txt");



        memberList.add(new Member(26188398,"Mand",  "Ulrik","Lehun",22,1600,"Competitor",true,0));
        memberList.add(new Member(61474346,"Mand",  "Jacob","Gram",23,1600,"Competitor",true,0));
        memberList.add(new Member(85986098,"Kvinde","Mette","Frederiksen",45,500,"Passive",false,0));
        memberList.add(new Member(28985049,"Mand",  "Adam","Aboudi",14,1000,"Competitor",true,0));
        memberList.add(new Member(48484848,"Mand",  "Klaus","Jensen",69,1200,"Motionist",true,0));
        memberList.add(new Member(94994376,"Mand",  "Preben","Lundin",58,1600,"Motionist",true,0));
        memberList.add(new Member(64576285,"Kvinde","Jeniffer","Lopez",53,1600,"Motionist",true,0));
        memberList.add(new Member(68752957,"Mand",  "Ulrik","Lehun",22,1600,"Passive",false,0));
        memberList.add(new Member(26429712,"Mand",  "Frederik", "Wessel", 24, 500, "Passive",false,0));
        memberList.add(new Member(29282754,"Mand",  "Christian", "Lorenzen", 29, 1600, "Competitor",true,0));




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
                    cashier.cashierMenu();
                }
                else if (tal == 7)
                {
                    sentinel = false;
                    System.out.println("Aabner træner");
                    coach.coachMenu();
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
    }



}