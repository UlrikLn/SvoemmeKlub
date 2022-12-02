import java.io.*;
import java.util.*;

public class MemberList {

   Scanner s = new Scanner(System.in);

   Member member;



   boolean sentinel = true;
   
   public  list()
   {


      int x = s.nextInt();
      Member test = memberList.get(x);

          while (sentinel)
        {
            if (s.hasNextInt())
            {
                Member hello = PersonList.get(x);
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
