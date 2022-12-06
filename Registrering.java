import java.awt.*;
import java.io.*;
import java.util.*;

public class Registrering
{
   public static ArrayList<Member> memberList = new ArrayList<>();
   File fMembers = new File("members.txt");
   Scanner scan = new Scanner(System.in);
   Desktop desktop = Desktop.getDesktop();
   boolean sentinel = true;
   Member member = new Member();


   public void filSkrivning(Member member)
   {
      try
      {
         //PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         FileWriter fw = new FileWriter("members.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw);

         out.append(member.toString());

         /*output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();*/
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
      memberList.add(new Competitor())
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