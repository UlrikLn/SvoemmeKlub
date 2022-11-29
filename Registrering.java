import java.util.Scanner;
import java.util.ArrayList;
public class Registrering
{
   public static void main(String[] args) 
   {

      Scanner scan = new Scanner(System.in);

      int id = -99;

      ArrayList<Person> Members = new ArrayList<Person>();
      Person person1 = new Person("Ole", 50, false, 0);
      person1.whatMember();
      Members.add(person1);

   }




}
