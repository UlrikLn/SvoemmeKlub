import java.io.*;
import java.util.*;

public class MemberList {

   Scanner s = new Scanner(System.in);
   boolean sentinel = true;
   
   public Person list()
   {

    ArrayList<Person> PersonList = new ArrayList<Person>();
      PersonList.add(new Person("Magnus Eklund",8 , true, 0));
      PersonList.add(new Person("Hanne Arvidsson", 67, false, 200));
      PersonList.add(new Person("Emma Eklund", 10, true, 300));
      /*PersonList.add(new Person("Sofia Mattsson",22 , ));
      PersonList.add(new Person("Liva Jakobsson",13 , ));
      PersonList.add(new Person("Arthur Lundberg",18 , ));
      PersonList.add(new Person("Camilla Jørgensen",20 , ));
      PersonList.add(new Person("Elias Arvidsson",10 , ));
      PersonList.add(new Person("Kirsten Andersson",78 , ));
      PersonList.add(new Person("Hugo Søgaard",35 , ));
      PersonList.add(new Person("Jette Larsson",54 , ));
      PersonList.add(new Person("Melanie Nørregaard",22 , ));
      PersonList.add(new Person("Anna Mattsson",8 , ));
      PersonList.add(new Person("Peter Wikström",45 , ));
      PersonList.add(new Person("Oscar Nyström",25 , ));
      PersonList.add(new Person("Sofia Nilsson",12 , ));
      PersonList.add(new Person("Jan Mørk",54 , ));
      PersonList.add(new Person("Karla Fransson",12 , ));
      PersonList.add(new Person("Josefine Henriksson",13 , ));
      PersonList.add(new Person("Arthur Söderberg",7 , ));
      PersonList.add(new Person("Anne Pettersson",45 , ));
      PersonList.add(new Person("Noah Karlsson",13 , ));
      PersonList.add(new Person("Felix Mohamed",16 , ));
      PersonList.add(new Person("Gitte Lundqvist",55 , ));
      PersonList.add(new Person("Thomas Fransson",53 , ));
      PersonList.add(new Person("Frederik Lindström",32 , ));
      PersonList.add(new Person("Søren Sandberg",69, ));
      PersonList.add(new Person("Mette Fransson",49, ));
      PersonList.add(new Person("Karla Eriksson",31 , ));
      PersonList.add(new Person("Mette Håkansson",23, ));
      PersonList.add(new Person("Pernille Johansson",28, ));
      PersonList.add(new Person("Victoria Arvidsson",25, ));
      PersonList.add(new Person("Elias Jakobsson",6 , ));
      PersonList.add(new Person("Sofia Lundin",14 , ));
      PersonList.add(new Person("Kirsten Henriksson",66 , ));
      PersonList.add(new Person("Louise Lindqvist",58 , ));
      PersonList.add(new Person("Victor Löfgren",67 , ));
      PersonList.add(new Person("Frederik Karlsson",19 , ));
      PersonList.add(new Person("Torben L. Nørgaard",43 , ));
      PersonList.add(new Person("Trine O. Poulsen",51 , ));
      PersonList.add(new Person("Jacob B. Hansen",23 , ));
      PersonList.add(new Person("Andrea A. Jepsen",28 , ));
      PersonList.add(new Person("Carl M. Lorenzen",78 , ));
      PersonList.add(new Person("Nikolaj N. Ravn",34 , ));
      PersonList.add(new Person("David S. Krogh",42 , ));
      PersonList.add(new Person("Martin C. Jepsen",48 , ));
      PersonList.add(new Person("Frederik H. Dam",24 , ));
      PersonList.add(new Person("Lasse L. Andresen",64 , ));
      PersonList.add(new Person("Morten A. Hedegaard",76 , ));*/
      
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
