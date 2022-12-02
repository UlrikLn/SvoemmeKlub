import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public enum SwimmingDisciplines
{
    BUTTERFLY, BRYSTSVOEMNING, RYGCRAWL, CRAWL
}

public class Competitor extends Member
{
    private double trainingResult;
    SwimmingDisciplines swimmingDisciplines;

    public Competitor(int id, String gender, String firstName, String surname, int birthday, int subscription, String memberType, boolean membershipActive,int debt, double trainingResult, SwimmingDisciplines swimmingDisciplines)
    {
        super(id, gender, firstName, surname, birthday, subscription, memberType, membershipActive);
        this.trainingResult = trainingResult;
        this.swimmingDisciplines = swimmingDisciplines;

    }

    // Tildel svømmediscipliner til en competitor
    public void SwimmingDiscipline(Competitor competitor)
    {
        System.out.println("Disciplin: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(choice.equals("butterfly"))
        {
            competitor.setSwimmingDisciplines(swimmingDisciplines.BUTTERFLY);
        }
        else if (choice.equals("brystsvømning"))
        {
            competitor.setSwimmingDisciplines(swimmingDisciplines.BRYSTSVOEMNING);
        }
        else if (choice.equals("rygcrawl"))
        {
            competitor.setSwimmingDisciplines(swimmingDisciplines.RYGCRAWL);
        }
        else if (choice.equals("crawl"))
        {
            competitor.setSwimmingDisciplines(swimmingDisciplines.CRAWL);
        }
    }
    /*
    public void tellItLikeItIs() {
        switch (swimmingDisciplines) {
            case BUTTERFLY:
                System.out.println("Du har valgt at ");
                break;

            case BRYSTSVOEMNING:
                System.out.println("Fridays are better.");
                break;

            case RYGCRAWL:
                System.out.println("Fridays are better.");
                break;

            case CRAWL:
                System.out.println("Fridays are better.");
                break;

            default:
                System.out.println("Du kan ikke vælge den discpiplin");
                break;
        }
    }
     */

    public void setTrainingResult(double trainingResult) {
        this.trainingResult = trainingResult;
    }

    public SwimmingDisciplines getSwimmingDisciplines() {
        return swimmingDisciplines;
    }

    public void setSwimmingDisciplines(SwimmingDisciplines swimmingDisciplines) {
        this.swimmingDisciplines = swimmingDisciplines;
    }

    // Måske lave en toSring

}
