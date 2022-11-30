import java.util.Scanner;
import java.util.ArrayList;

public class Registrering
{
   File fMembers = new File("members.txt");

   public void filSkrivning(Member member)
   {
      try {
         PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();
         System.out.println("\n Nyt medlem er oprettet, se medlemmer under filen members.txt \n");
      }
      catch (IOException e)
      {
         System.out.println("error");
         e.printStackTrace();
      }
      try
      {
         System.out.println("Do you want to see the members? Y/N");
         Scanner scan = new Scanner(System.in);
         char c = scan.next().charAt(0);

         if (c == Y)
         {
            desktop.open(fMembers);
         }
         else
         {
            break;
         }

      }
      catch (Exception e)
      {
         System.out.println("**********************Error**********************");
         System.out.println("                File doesn't open");
         System.out.println("*************************************************");
      }

   }

   /*public void showMembers() throws FileNotFoundException
   {
      Scanner fileReader = new Scanner(fileAlleMedlemmer);
      while (fileReader.hasNext())
         System.out.println(fileReader.nextLine());
   }

   private ArrayList<Member> members = new ArrayList<>();
   private fileScanner = new filHåndtering*/

}