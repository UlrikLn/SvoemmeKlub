import java.awt.*;
import java.io.*;
import java.util.*;

public class Registration
{
   public ArrayList<Member> memberList = new ArrayList<>();

   File fMembers = new File("members.txt");
   Scanner scan = new Scanner(System.in);
   Desktop desktop = Desktop.getDesktop();
   boolean sentinel = true;
   Member member = new Member();
   Teams team = new Teams();
   Coach coach = new Coach();

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
      if (memberType.equals("nej"))
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
         if (age < 18)
         {
            System.out.println("Medlemmet er motionist og i kategorien juniormedlem.");
            subscription = 1000;
            System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
         }
         else if (age >= 18 && age < 60)
         {
            System.out.println("Medlemmet er motionist og i kategorien seniormedlem.");
            subscription = 1600;
            System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
         }
         else if (age > 60)
         {
            System.out.println("Medlemmet er motionist og i kategorien pensionistmedlem.");
            subscription = 1200;
            System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");
         }
         fileWrite();
         System.out.println();


         memberList.add(exerciser);
         System.out.print(exerciser.toString());

      //Konkurrencesvømmer
      }
      else if (memberType.equals("ja"))
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
         if (age < 18)
         {
            team.addJuniorCompetitor(competitor);
            System.out.println("Medlemmet er konkurrencesvømmer i kategorien juniormedlem, og dermed tildelt ungdomsholdet.");
            subscription = 1000;
            System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
         }
         else if (age >= 18 && age < 60)
         {
            subscription = 1600;
            System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
            System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
            team.addSeniorCompetitor(competitor);
         }
         else if (age > 60)
         {
            System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
            subscription = 1200;
            System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");

         }

         System.out.println();
         memberList.add(competitor);
         member.whatSubcription(competitor);
         System.out.println(competitor.toString());
      }

   }

   public void fileWrite()throws Exception
   {
      try
      {

         FileWriter fw = new FileWriter("members.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw);
         out.append(member.toString());
         System.out.println("Person er arkiveret i databasen");

         /*PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();
         System.out.println("\n Nyt medlem er oprettet, se medlemmer under filen members.txt \n");*/
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

   public void seeList() throws Exception
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




/*
* else if (menu == 2)
      {
         PrintStream writeFileAktive = new PrintStream(new FileOutputStream("AktiveBestillinger.txt",true));
// PrintStream giver os en class som gør at vi kan printe info.
// FileOutPutStream vælger vi at printe til en fil og arbejder sammen med PrintStream (navn på String/fil, boolean append).
// Begge er subclasses til class OutputStream.
         Pizza p = l.list();
// l kommer fra PizzaList class, list er metoden. Her laver vi en ny variabel ud fra instanten vi lavede højere oppe.
         LocalTime lt = u.tid();
// u kommer fra class LokalTid og tid er metoden.
         writeFileAktive.printf("%.5s",lt);
// printf() er er en metode som formaterer det som man skriver. Det starter altid med % og så kommandoen/teksten.
// "%.5s" betyder at man kun tager de 5 første tegn i vores string. lt bruger vores metode.
         writeFileAktive.println(" " + p);
// p kommer fra l.list()
         try {
               FileReader fr = new FileReader(fAktiv);
// FileReader åbner filen og indlæser den i vores software.
               BufferedReader br = new BufferedReader(fr);
// Buffer er en måde at gemme info kortvarigt i hukommelsen i stedet for harddisken, så det går meget hurtigere.
// Læser informationen på den fil som FileReader åbner.

               List<String> list=new ArrayList<String>();
// Her laver vi en ny arraylist.
               String string;
// Her laver vi en ny String variabel.
               while((string = br.readLine()) != null)
// Så længe BufferedReader har en linje med String at læse så fortsætter loopet.
               {
                  list.add(string);
// Her tilføjer vi den linje vi læser i bufferedreader til vores arrayList.
               }
               br.close();
// Her lukker vi bufferedReader, så den ikke konstant kører i baggrunden. Så frigiver vi hukommelse til systemet.
               Collections.sort(list);
// Her sorterer vi listen.
              FileWriter fileSort = new FileWriter(fAktiv);
// Herefter vil vi gerne skrive til filen.
               BufferedWriter bufferSort = new BufferedWriter(fileSort);
// Buffered writer fungerer kun i kombination med fileWriter.
               for(String s: list)
// En anden måde at skrive (int s = 0; s < list.size(); s++) {bufferSort.write(list.get(s))}
// https://beginnersbook.com/2013/12/how-to-loop-arraylist-in-java/
               {
                  bufferSort.write(s);
                  bufferSort.write("\n");
// Her skriver vi så en linje ad gangen efterfulgt af en næste linje indtil loopet er færdigt.
               }
               bufferSort.close();
               System.out.println("\n Filen er sorteret");
// Så lukker vi bufferSort så den ikke fylder i hukommelsen og ellers vil loopet ikke køre og informationen vil forsvinde.

           }
           catch (Exception e)
           {
               System.out.print("Der var en fejl med sorteringen \n");
               System.out.println(e);
           }
         bw.newLine();
 // Laver en ny linje så der ikke skrives på samme linje.
         System.out.println();
         System.out.println("*************************************************");
         System.out.println("               Bestilling modtaget! ");
         System.out.println("*************************************************");
         System.out.println();
         writeFileAktive.close();

      }

* */