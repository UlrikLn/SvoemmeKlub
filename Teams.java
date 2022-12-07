import java.util.*;

public class Teams
{

    private final ArrayList<Competitor> juniorTeam = new ArrayList<>();
    private final ArrayList<Competitor> seniorTeam = new ArrayList<>();

    public void addJuniorCompetitor(Competitor competitor)
    {
        juniorTeam.add(competitor);
    }

    public void addSeniorCompetitor(Competitor competitor)
    {
        seniorTeam.add(competitor);
    }

    public ArrayList<Competitor> getSeniorTeam()
    {
        return seniorTeam;
    }

    public ArrayList<Competitor> getJuniorTeam()
    {
        return juniorTeam;
    }

    public static String selectDiscipline()
    {
        boolean sentinel = true;
        Scanner scan = new Scanner(System.in);
        Member member = new Member();

        while ( sentinel )
        {
            System.out.println("Vælg en disciplin fra 1-4");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | [Crawl]");
            System.out.println("| 2 | [Rygcrawl]");
            System.out.println("| 3 | [Butterfly]");
            System.out.println("| 4 | [Brystsvømning]");
            System.out.println("----------------------------------------------------------");
            try
            {
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    sentinel = false;
                    return "Crawl";
                } else if ( tal == 2 )
                {
                    sentinel = false;
                    return "Rygcrawl";
                } else if ( tal == 3 )
                {
                    sentinel = false;
                    return "Butterfly";
                } else if ( tal == 4 )
                {
                    sentinel = false;
                    return "Brystsvømning";
                } else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                    member.sleep();
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                member.sleep();
                scan.next();
            }

        }
        return "svømmer";
    }

}

