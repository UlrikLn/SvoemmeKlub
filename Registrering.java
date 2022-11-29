import java.util.Scanner;
import java.util.ArrayList;
public class Registrering
{
   public static void main(String[] args) 
   {

      Scanner scan = new Scanner(System.in);





      ArrayList<Person> Members = new ArrayList<Person>();
      Person person1 = new Person("Ole", 50, true, 0);
      person1.whatMember();
      Members.add(person1);

      int id =scan.nextInt();
      System.out.print("ID: [" + id);
      System.out.println(person1.showInfo());

   }




}
