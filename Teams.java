import java.util.ArrayList;
public class Teams
{

        private ArrayList<Competitor> juniorTeam = new ArrayList<>();
        private ArrayList<Competitor> seniorTeam = new ArrayList<>();

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
    }

