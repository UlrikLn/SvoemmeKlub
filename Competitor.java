import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Competitor extends Member
{
    private double trainingResult;
    SwimmingDisciplines swimmingDisciplines;

    enum SwimmingDisciplines {BUTTERFLY, BRYSTSVOEMNING, RYGCRAWL, CRAWL}

    public Competitor(int id, String gender, String firstName, String surname, int birthday, int subscription, String memberType, boolean membershipActive)throws ParseException
    {
        super(id, gender, firstName, surname, birthday, subscription, memberType, membershipActive);
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
