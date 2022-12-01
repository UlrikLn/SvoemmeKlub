import java.util.*;

public class Cashier
{
    // Liste alle priser (Done)
    // Se Hvem der er aktive og hvem der er passive
    // Hvem der har betal og ikke betalt
    // Gøre folk passive
    Member member = new Member()
    
    public void subcribtionPrices()
    {
        System.out.println("Kontingent priser");
        System.out.println("Under 18 år      =  1000 kr");
        System.out.println("Mellem 18-60 år  =  1600 kr");
        System.out.println("Over 60 år       =  1200 kr");
        System.out.println("Passiv medlem    =   500 kr");
        System.out.println("");
    }

    public void seeActiveAndPassive()
    {

    }

    public void restance()
    {
        for (Person person: persons) {

            if (person.getAge() > 30) {

                result.add(person);
            }
        }
    }

    public void editMember()
    {

    }
}
