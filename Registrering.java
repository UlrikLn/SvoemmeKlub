import java.awt.*;
import java.io.*;
import java.util.*;

public class Registrering
{
   File fMembers = new File("members.txt");
   Scanner scan = new Scanner(System.in);
   Desktop desktop = Desktop.getDesktop();
   boolean sentinel = true;

/*
try(FileWriter fw = new FileWriter("members.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println("the text");
    //more code
    out.println("more text");
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
*/

   public void filSkrivning(Member member)
   {
      try
      {
         PrintStream output = new PrintStream(new FileOutputStream(fMembers, true));
         output.append("\n");
         output.append(member.toString());
         output.append("\n");
         output.close();
         System.out.println("\n Nyt medlem er oprettet, se medlemmer under filen members.txt \n");
      } catch (IOException e)
      {
         System.out.println("error");
         e.printStackTrace();
      }
   }
   public void openFile()
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

   /*public void showMembers() throws FileNotFoundException
   {
      Scanner fileReader = new Scanner(fileAlleMedlemmer);
      while (fileReader.hasNext())
         System.out.println(fileReader.nextLine());
   }

   private ArrayList<Member> members = new ArrayList<>();
   private fileScanner = new filHåndtering*/

}