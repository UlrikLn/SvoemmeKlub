import java.util.Scanner;
import java.util.*;

public class Coach
{
/*Indsætte scanner og alle valgmulighederne træneren skal kunne  ()
Et juniorhold (u. 18) og seniorhold (18+)
For hver svømmedisciplin:
    Liste over træningsresultat & dato
    Liste over konkurrencec-aktive: registreres stævne, placering og tid
Oversigt, der kan vise klubbens top 5 svømmere inden for hver svømmedisciplin konkurrence/træning.
 */


    boolean sentinel = true;
    Scanner scan = new Scanner(System.in);
    Member member = new Member();
    Menu menu = new Menu();

    public void coachMenu()
    {
        while ( sentinel )
        {
            System.out.println("Vælg et tal fra 0-9 for at å4bne funktioner:");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | Indtast Resultater Junior");
            System.out.println("| 2 | Indtast Resultater Senior");
            System.out.println("| 3 | Se Top 5 Junior");
            System.out.println("| 4 | Se Top 5 Senior");
            System.out.println("| 5 | Se Trænings Tider Junior");
            System.out.println("| 6 | Se Trænings Tider Senior");
            System.out.println("| 7 | Se Konkurrence Tider Junior");
            System.out.println("| 8 | Se Konkurrence Tider Senior");
            System.out.println("| 0 | Gå Tilbage");
            System.out.println("----------------------------------------------------------");

            try
            {
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    sentinel = false;
                    System.out.println("Indtast Resultater for junior medlem: ");

                    System.out.println("Åbner 1");
                } else if ( tal == 2 )
                {
                    sentinel = false;
                    System.out.println("Åbner 2");
                } else if ( tal == 3 )
                {
                    sentinel = false;
                    System.out.println("Åbner 3");
                } else if ( tal == 4 )
                {
                    sentinel = false;
                    System.out.println("Åbner 4");
                } else if ( tal == 5 )
                {
                    sentinel = false;
                    System.out.println("Åbner 5");
                } else if ( tal == 6 )
                {
                    sentinel = false;
                    System.out.println("Åbner 6");
                } else if ( tal == 7 )
                {
                    sentinel = false;
                    System.out.println("Åbner 7");
                } else if ( tal == 8 )
                {
                    sentinel = false;
                    System.out.println("Åbner 8");
                } else if ( tal == 0 )
                {
                    member.sleep();
                    Menu.menuLoop();
                    sentinel = false;
                    System.out.println("Går Tilbage...");
                } else
                {
                    System.out.println("Ugyldigt tal, prov igen med et tal fra 0 - 9");
                    member.sleep();
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                member.sleep();
                scan.next();
            }

        }
    }


    /*public void assignTrainingResultsJunior()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens telefonnummer: ");
            int choice = scan.nextLine();
            System.out.print("Svømmerens tid: ");
            double time = scan.nextDouble();

            for ( Member pop : registration.memberList )
            {
                if ( pop.getId() == choice )
                {
                    registration.memberList.printfill + time;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et nummer");
            member.sleep();
            scan.next();
        }
    }



    public void assignTrainingResultsSenior(Teams teams)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Svømmerens navn: ");
        String navn = scan.nextLine();
        System.out.print("Svømmerens tid: ");
        double time = scan.nextDouble();
        for ( int i = 0; i < teams.getSeniorTeam().size(); i++ )
        {
            if ( navn.equals(teams.getSeniorTeam().get(i).getFullName()) )
            {
                teams.getSeniorTeam().get(i).setTrainingResult(time);
                break;
            }
        }
    }
*/
  /*
  //Disse metoder kunne vi ikke nå at få til at virke...
  public void udtagSvømmereTilKonkurrence(Hold hold) {
    int minimumsKrav = 10; //hard coded adgangskrav til vores egen hjemmelavede konkurrence.
    for (int i = 0; i < hold.getJuniorKonkurrencesvømmere().size(); i++) {
      if (hold.getJuniorKonkurrencesvømmere().get(i).getTræningsResultat() < minimumsKrav) {
        hold.getKonkurrenceDeltagelse().add(hold.getJuniorKonkurrencesvømmere().get(i));
      }
    }
  }
  //
  public void udskrivUdvalgteKonkurrencedeltagere(Hold hold) {
    for (int i = 0; i < hold.getKonkurrenceDeltagelse().size(); i++) {
      System.out.println(hold.getKonkurrenceDeltagelse().get(i));
    }
  } */

}
