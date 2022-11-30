import java.io.*;
import java.util.*;

public class MemberList {

   Scanner s = new Scanner(System.in);
   boolean sentinel = true;
   
   public Person list()
   {


      int x = s.nextInt();
      Person test = PersonList.get(x);

          while (sentinel)
        {
            if (s.hasNextInt())
            {
                Person hello = PersonList.get(x);
                sentinel = false;
            }
            else if (s.hasNext())
            {
                s.next();
                System.out.print("Det duer kun med tal. ");
            }
            
        }
        return test;
   }
}
