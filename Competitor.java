import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Competitor extends Member
{
    private double trainingResult;
    private String swimmingDisciplines;

    public Competitor(int id, String gender, String firstName, String surname, int age, int subscription, String memberType, boolean membershipActive, int debt, double trainingResult, String swimmingDisciplines)
    {
        super(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt);
        this.trainingResult = trainingResult;
        this.swimmingDisciplines = swimmingDisciplines;

    }

    // Setters

    public void setTrainingResult(double trainingResult)
    {
        this.trainingResult = trainingResult;
    }

    public void setSwimmingDisciplines(String swimmingDisciplines)
    {
        this.swimmingDisciplines = swimmingDisciplines;
    }

    // Getters

    public double getTrainingResult(double trainingResult)
    {
        return trainingResult;
    }

    public String getSwimmingDisciplines(String swimmingDisciplines)
    {
        return swimmingDisciplines;
    }

    // Override
    public String toString()
    {
        if(getMembershipActive() == true)
        {
            String subs = "dummy";
            if ( getSubscription() == 0 )
            {
                subs = ", Kontingent: [Betalt]";
            } else if ( getSubscription() > 0 )
            {
                subs = ", Kontingent: [Ikke Betalt]";
            }
        }
        return "ID: " + getId() + ", Navn: " + getFullName() + ", Køn: " + getGender() +
                ", Alder: " + getAge() +  ", Medlemskab: [Aktiv]" + ", Kontingent: " + getSubscription() + ", Disciplin: " + swimmingDisciplines;
    }


}
