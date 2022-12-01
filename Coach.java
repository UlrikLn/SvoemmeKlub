import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Coach
{

        public void tildelTræningsresultaterJunior(Hold hold) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens navn: ");
            String navn = scan.nextLine();
            System.out.print("Svømmerens tid: ");
            double tid = scan.nextDouble();
            for (int i = 0; i < hold.getJuniorKonkurrencesvømmere().size(); i++) {
                if (navn.equals(hold.getJuniorKonkurrencesvømmere().get(i).getFuldeNavn())) {
                    hold.getJuniorKonkurrencesvømmere().get(i).setTræningsResultat(tid);
                    break;
                }
            }
        }

        public void tildelTræningsresultaterSenior(Hold hold) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens navn: ");
            String navn = scan.nextLine();
            System.out.print("Svømmerens tid: ");
            double tid = scan.nextDouble();
            for (int i = 0; i < hold.getSeniorKonkurrencesvømmere().size(); i++) {
                if (navn.equals(hold.getSeniorKonkurrencesvømmere().get(i).getFuldeNavn())) {
                    hold.getSeniorKonkurrencesvømmere().get(i).setTræningsResultat(tid);
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
