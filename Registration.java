import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Registration
{
    public ArrayList<Member> memberList = new ArrayList<>();

    File fMembers = new File("members.txt");
    Scanner scan = new Scanner(System.in);
    Desktop desktop = Desktop.getDesktop();
    Cashier cashier = new Cashier();
    Member member = new Member();
    Teams team = new Teams();

    public void registerMember() throws Exception
    {

        System.out.println("Opret det nye medlem herunder: ");
        System.out.print("Skal det nye medlem registreres som konkurrencesvømmer, 'ja' eller 'nej': ");
        String memberType = scan.nextLine();

      /*System.out.print("Fornavn: ");
      String firstName = scan.nextLine();
      System.out.print("Efternavn: ");
      String surname = scan.nextLine();
      //System.out.println("Køn ");
      String gender = scan.nextLine();
      System.out.print("Alder: ");
      int age = scan.nextInt();
      System.out.print("Telefonnummer: ");
      int id = scan.nextInt();
      boolean membershipActive = true;
      int debt = 0;
      int subscription = 0;
      double trainingResult = 0;
      String swimmingDisciplines = "";*/

        //Motionist
        if ( memberType.equals("nej") )
        {
            System.out.print("Fornavn: ");
            String firstName = scan.nextLine();
            System.out.print("Efternavn: ");
            String surname = scan.nextLine();
            System.out.print("Køn ");
            String gender = scan.nextLine();
            System.out.print("Alder: ");
            int age = scan.nextInt();
            System.out.print("Telefonnummer: ");
            int id = scan.nextInt();
            boolean membershipActive = true;
            int debt = 0;
            int subscription = 0;
            Exerciser exerciser = new Exerciser(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt);
            if ( age < 18 )
            {
                System.out.println("Medlemmet er motionist og i kategorien juniormedlem.");
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age >= 18 && age < 60 )
            {
                System.out.println("Medlemmet er motionist og i kategorien seniormedlem.");
                subscription = 1600;
                System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age > 60 )
            {
                System.out.println("Medlemmet er motionist og i kategorien pensionistmedlem.");
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");
            }
            fileWrite();
            System.out.println();


            memberList.add(exerciser);
            System.out.print(exerciser);

            //Konkurrencesvømmer
        } else if ( memberType.equals("ja") )
        {
            System.out.print("Fornavn: ");
            String firstName = scan.nextLine();
            System.out.print("Efternavn: ");
            String surname = scan.nextLine();
            System.out.print("Køn: ");
            String gender = scan.nextLine();
            System.out.print("Alder: ");
            int age = scan.nextInt();
            System.out.print("Telefonnummer: ");
            int id = scan.nextInt();
            boolean membershipActive = true;
            int debt = 0;
            int subscription = 0;
            double trainingResult = 0;
            String swimmingDisciplines = Teams.selectDiscipline();

            Competitor competitor = new Competitor(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt, trainingResult, swimmingDisciplines);
            if ( age < 18 )
            {
                team.addJuniorCompetitor(competitor);
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien juniormedlem, og dermed tildelt ungdomsholdet.");
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age >= 18 && age < 60 )
            {
                subscription = 1600;
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
                System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
                team.addSeniorCompetitor(competitor);
            } else if ( age > 60 )
            {
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");

            }

            System.out.println();
            memberList.add(competitor);
            member.whatSubcription(competitor);
            System.out.println(competitor);
        }

    }

    public void newMember()
    {
        memberList.add(new Member(26188398, "Mand", "Ulrik", "Lehun", 22, 1600, "Competitor", true, 0));
        memberList.add(new Member(61474346, "Mand", "Jacob", "Gram", 23, 1600, "Competitor", true, 0));
        memberList.add(new Member(85986098, "Kvinde", "Mette", "Frederiksen", 45, 500, "Passive", false, 0));
        memberList.add(new Member(28985049, "Mand", "Adam", "Aboudi", 14, 1000, "Competitor", true, 0));
        memberList.add(new Member(48484848, "Mand", "Klaus", "Jensen", 69, 1200, "Motionist", true, 0));
        memberList.add(new Member(94994376, "Mand", "Preben", "Lundin", 58, 1600, "Motionist", true, 0));
        memberList.add(new Member(64576285, "Kvinde", "Jeniffer", "Lopez", 53, 1600, "Motionist", true, 0));
        memberList.add(new Member(68752957, "Mand", "Ulrik", "Lehun", 22, 1600, "Passive", false, 0));
        memberList.add(new Member(26429712, "Mand", "Frederik", "Wessel", 24, 500, "Passive", false, 0));
        memberList.add(new Member(29282754, "Mand", "Christian", "Lorenzen", 29, 1600, "Competitor", true, 0));
        memberList.add(new Competitor(22975312, "Kvinde", "Morten", "Olsen", 64, 1200, "Competitor", true, 0, 12.02, "Crawl"));
    }

    public void seeList() throws Exception
    {
        for ( Member value : memberList )
        {
            System.out.println(value);

        }
    }

    public void deleteMember()
    {
        try
        {
            System.out.println("Indtast medlems id: ");
            int choice = scan.nextInt();

            for (int i = 0; i < memberList.size(); i++)
            {
                if (memberList.get(i).getId() == choice)
                {
                    memberList.remove(i);
                }
            }
            for (int i = 0; i < cashier.debtList.size(); i++)
            {
                if (cashier.debtList.get(i).getId() == choice)
                {
                    cashier.debtList.remove(i);
                }
            }
        }catch (Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et nummer");
            scan.next();
        }
    }

    public void fileWrite() throws Exception
    {
        try
        {
            FileWriter fw = new FileWriter("members.txt", true);
            Writer output = new BufferedWriter(fw);

            for (int i = 0; i<1; i++)
            {
                output.write(memberList.get(memberList.size() -1).toString() + "\n");
            }
            output.close();
            System.out.println("Person er arkiveret i databasen");

        } catch (IOException e)
        {
            System.out.println("error: " + e);
            JOptionPane.showMessageDialog(null, "the file doesn't exist");
        }
    }
}

/*
FileWriter fw = new FileWriter("members.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw);
         out.append(member.toString());
         System.out.println("Person er arkiveret i databasen");

PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();
         System.out.println("\n Nyt medlem er oprettet, se medlemmer under filen members.txt \n");

FileWriter fw = new FileWriter("members.txt", true);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i<memberList.size(); i++)
            {
                output.write(memberList.get(i).toString() + "\n");
            }
            output.close();
            System.out.println("Person er arkiveret i databasen");
 */





/*
 public void showMembers() throws FileNotFoundException
   {
      Scanner fileReader = new Scanner(fileAlleMedlemmer);
      while (fileReader.hasNext())
         System.out.println(fileReader.nextLine());
   }

   private ArrayList<Member> members = new ArrayList<>();
   private fileScanner = new filHåndtering
   */