public class Registrering
{
   public static void main(String[] args) 
   {
      Person person1 = new Person (0, "Ole", 48, false, 0);
      Person person2 = new Person (0, "Jørgen", 12, false, 0);
      person1.whatMember();
      System.out.println(person1.id);
      System.out.println(person2.id);
   }
}
