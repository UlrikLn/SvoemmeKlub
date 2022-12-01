import java.util.*;
import java.io.*;
import java.awt.Desktop;

public class OpenFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        boolean sentinel = true;
        Scanner scan = new Scanner(System.in);
        Desktop desktop = Desktop.getDesktop();
        File fMembers = new File("members.txt");

        while (sentinel)
        {
            System.out.println("Do you want to see the members? y/n");
            char c = scan.next().charAt(0);
            if (c == 'y')
            {
                sentinel = false;

                try
                {
                    desktop.open(fMembers);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            else if (c == 'n')
            {
                System.out.println("");
                sentinel = false;
                scan.close();
            }
            else
            {
                System.out.println("Wrong input, try again please");
            }

        }
    }
}