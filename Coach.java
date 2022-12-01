import java.util.Scanner;
public class Coach
{

        public void assignTrainingResultsJunior(Teams teams)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens navn: ");
            String navn = scan.nextLine();
            System.out.print("Svømmerens tid: ");
            double time = scan.nextDouble();
            for (int i = 0; i < teams.getJuniorTeam().size(); i++)
            {
                if (navn.equals(teams.getJuniorTeam().get(i).getFullName()))
                {
                    teams.getJuniorTeam().get(i).setTrainingResult(time);
                    break;
                }
            }
        }

        public void assignTrainingResultsSenior(Teams teams)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens navn: ");
            String navn = scan.nextLine();
            System.out.print("Svømmerens tid: ");
            double time = scan.nextDouble();
            for (int i = 0; i < teams.getSeniorTeam().size(); i++)
            {
                if (navn.equals(teams.getSeniorTeam().get(i).getFullName()))
                {
                    teams.getSeniorTeam().get(i).setTrainingResult(time);
                    break;
                }
            }
        }

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
