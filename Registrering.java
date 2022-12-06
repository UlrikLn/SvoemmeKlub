import java.awt.*;
import java.io.*;
import java.util.*;

public class Registrering
{
   public ArrayList<Member> memberList = new ArrayList<>();
   File fMembers = new File("members.txt");
   Scanner scan = new Scanner(System.in);
   Desktop desktop = Desktop.getDesktop();
   boolean sentinel = true;
   Member member = new Member();

   public void registerMember()
   {



      System.out.println("Opret det nye medlem herunder: ");
      System.out.print("Skal det nye medlem registreres som konkurrencesvømmer, 'ja' eller 'nej': ");
      String memberType = scan.nextLine();

      System.out.print("Fornavn: ");
      String firstname = scan.nextLine();
      System.out.print("Efternavn: ");
      String surname = scan.nextLine();
      System.out.print("Alder: ");
      int age = scan.nextInt();
      System.out.print("Telefonnummer: ");
      int id = scan.nextInt();


      //Motionist
      if (memberType.equals("nej")) {
         exerciser = new Exerciser(navn, alder, aktivitetsform, betalt);
         if (motionist.getAlder() < 18) {
            System.out.println("Medlemmet er motionist og i kategorien juniormedlem.");
         } else if (motionist.getAlder() >= 18) {
            System.out.println("Medlemmet er motionist og i kategorien seniormedlem.");
         }
         System.out.println();
         System.out.print(motionist.toString());
         medlemmer.add(motionist);
         kassererController.kontingentBetaling(motionist);
         filHåndtering.filSkrivning(motionist);

         //Konkurrencesvømmer
      } else if (memberType.equals("ja")) {
         konkurrenceSvømmer = new KonkurrenceSvømmer(navn, alder, aktivitetsform, betalt);
         if (konkurrenceSvømmer.getAlder() < 18) {
            hold.tilføjJuniorKonkurrencesvømmere(konkurrenceSvømmer);
            System.out.println("Medlemmet er konkurrencesvømmer i kategorien juniormedlem, og dermed tildelt ungdomsholdet.");
         } else if (konkurrenceSvømmer.getAlder() >= 18) {
            hold.tilføjSeniorKonkurrencesvømmere(konkurrenceSvømmer);
            System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
         }
         konkurrenceSvømmer.svømmeDisciplin(konkurrenceSvømmer);
         System.out.println();
         System.out.print(konkurrenceSvømmer.toString());
         medlemmer.add(konkurrenceSvømmer);
         kassererController.kontingentBetaling(konkurrenceSvømmer);
         filHåndtering.filSkrivning(konkurrenceSvømmer);
      }

   }

   public void filSkrivning(Member member)throws Exception
   {
      try
      {

         /*FileWriter fw = new FileWriter("members.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw);
         out.append(member.toString());*/

         PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();
         System.out.println("\n Nyt medlem er oprettet, se medlemmer under filen members.txt \n");
      } catch (IOException e)
      {
         System.out.println("error: " + e);
      }
   }

   public void newMember()
   {
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
      memberList.add(new Competitor(22975312, "Kvinde", "Morten", "Olsen", 64, 1200, "Competitor", true, 0, 12.02,"Crawl"));
   }

   public void seeList()
   {
      for ( Member value : memberList )
      {
         System.out.println(value);
      }
   }
}



/*
public void openFile() -- dette har vi sat ind i mindre stil i menuen.
   {
      while (sentinel)
      {
         System.out.println("Vil du se medlemslisten? j/n");
         char c = scan.next().charAt(0);
         if (c == 'j')
         {
            sentinel = false;
            try
            {
               desktop.open(fMembers);
            }
            catch (Exception e)
            {
               System.out.println("Der opstod en fejl: \n" + e);
            }
         }
         else if (c == 'n')
         {
            sentinel = false;
         }
         else
         {
            System.out.println("Ugyldigt input, prøv igen med | j | hvis du vil åbne dokumentet eller | n | hvis du vil fortryde");
         }

      }
   }
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