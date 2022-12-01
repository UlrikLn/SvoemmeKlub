import java.util.*;
import java.io.*;
import java.awt.Desktop;

public class OpenFile
{
    public static void main(String[] args)
    {
        boolean sentinel = true;
        Scanner scan = new Scanner(System.in);
        Desktop desktop = Desktop.getDesktop();
        File fMembers = new File("members.txt");

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
                    System.out.println("Der opstod en fejl: " + e);
                }
            }
            else if (c == 'n')
            {
                sentinel = false;
                scan.close();
            }
            else
            {
                System.out.println("Ugyldigt input, prøv igen med | j | hvis du vil åbne dokumentet eller | n | hvis du vil fortryde");
            }

        }
    }
}