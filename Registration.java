import java.util.*;

public class Registration
{
    public ArrayList<Member> memberList = new ArrayList<>();
    Menu menu;
    Scanner scan = new Scanner(System.in);
    boolean sentinel = true;
    Teams team;
    String gender = "humhum";
    int age = -100;
    int id = -99;
    public Registration(Teams team)
    {
        this.team = team;
    }

    public void filterInfo()
    {
        while (sentinel)
        {
            System.out.print("Køn: (mand/kvinde)");
            gender = scan.nextLine();
            if (gender.equals ("mand") || gender.equals("kvinde"))
            {
                sentinel = false;
            }
            else
            {
                System.out.print("Forkert input, skriv enten [mand] eller [kvinde]");
            }
        }
        sentinel = true;

        while (sentinel)
        {
            System.out.print("Alder: ");
            age = scan.nextInt();
            if (age >= 0 && age <= 100)
            {
                sentinel = false;
            }
            else
            {
                System.out.print("Forkert input, skriv et tal mellem 0 og 100");
            }
        }
        sentinel = true;

        while (sentinel)
        {
            System.out.print("Telefonnummer: ");
            id = scan.nextInt();
            if (id >= 10000000 && id <= 99999999)
            {
                sentinel = false;
            }
            else
            {
                System.out.print("Forkert input, skriv et tal mellem 30000000 og 99999999");
            }
        }
        sentinel = true;
    }

    public void registerMember(Member member)
    {

        System.out.println("Opret det nye medlem herunder: ");
        System.out.print("Skal det nye medlem registreres som konkurrencesvømmer, 'ja' eller 'nej': ");
        String memberType = scan.nextLine();

        if ( memberType.equals("nej") )
        {
            System.out.print("Fornavn: ");
            String firstName = scan.nextLine();
            System.out.print("Efternavn: ");
            String surname = scan.nextLine();
            filterInfo();
            boolean membershipActive = true;
            int debt = 0;
            int subscription = 0;
            Exerciser exerciser = new Exerciser(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt);
            if ( age < 18 )
            {
                System.out.println("Medlemmet er motionist og i kategorien juniormedlem.");
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age >= 18 && age < 60 )
            {
                System.out.println("Medlemmet er motionist og i kategorien seniormedlem.");
                subscription = 1600;
                System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age > 60 )
            {
                System.out.println("Medlemmet er motionist og i kategorien pensionistmedlem.");
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");
            }
            System.out.println();


            memberList.add(exerciser);
            System.out.print(exerciser);
            member.whatSubcription(exerciser);


        } else if ( memberType.equals("ja") )
        {
            System.out.print("Fornavn: ");
            String firstName = scan.nextLine();
            System.out.print("Efternavn: ");
            String surname = scan.nextLine();
            filterInfo();
            Teams teams = new Teams();
            String swimmingDisciplines = teams.selectDiscipline();
            boolean membershipActive = true;
            int debt = 0;
            int subscription = 0;
            int trainingResult = 0;
            String tournament = "Ingen";
            int placement = 0;
            int tournamentTime = 0;


            Competitor competitor = new Competitor(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt, trainingResult, swimmingDisciplines, tournament, placement, tournamentTime);
            if ( age < 18 )
            {
                team.addJuniorCompetitor(competitor);
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien juniormedlem, og dermed tildelt ungdomsholdet.");
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            } else if ( age >= 18 && age < 60 )
            {
                subscription = 1600;
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
                System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
                team.addSeniorCompetitor(competitor);
            } else if ( age > 60 )
            {
                System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");

            }

            System.out.println();
            memberList.add(competitor);
            member.whatSubcription(competitor);
            System.out.println(competitor);
        }
        Menu.menuLoop();
    }

    public void newMember()
    {
        memberList.add(new Member(26188398, "Mand", "Ulrik", "Lehun", 22, 1600, "Competitor", true, 0));
        memberList.add(new Member(61474346, "Mand", "Jacob", "Gram", 23, 1600, "Competitor", true, 200));
        memberList.add(new Member(85986098, "Kvinde", "Mette", "Frederiksen", 45, 500, "Passive", false, 0));
        memberList.add(new Member(28985049, "Mand", "Adam", "Aboudi", 14, 1000, "Competitor", true, 0));
        memberList.add(new Member(48484848, "Mand", "Klaus", "Jensen", 69, 1200, "Motionist", true, 0));
        memberList.add(new Member(94994376, "Mand", "Preben", "Lundin", 58, 1600, "Motionist", true, 0));
        memberList.add(new Member(64576285, "Kvinde", "Jeniffer", "Lopez", 53, 1600, "Motionist", true, 0));
        memberList.add(new Member(68752957, "Mand", "Ulrik", "Lehun", 22, 1600, "Passive", false, 0));
        memberList.add(new Member(26429712, "Mand", "Frederik", "Wessel", 24, 500, "Passive", false, 0));
        memberList.add(new Member(29282754, "Mand", "Christian", "Lorenzen", 29, 1600, "Competitor", true, 0));
    }

    public void sort()
    {

        Collections.sort(memberList, Comparator.comparingDouble(Member::get));
    }

    public void seeList()
    {
        for ( Member value : memberList )
        {
            System.out.println(value);

        }

    }

    public void deleteMember(Cashier cashier)
    {
        boolean notFinished = true;
        int choice;
        while (notFinished)
        {
            try
            {
                System.out.println("Indtast medlems id: ");
                choice = scan.nextInt();

                for (int m = 0; m < memberList.size(); m++)
                {
                    if ( memberList.get(m).getId() == choice )
                    {
                        for (int c = 0; c < cashier.debtList.size(); c++)
                        {
                            if ( cashier.debtList.get(c).getId() == choice )
                            {
                                System.out.println("Husk at brugeren: " + choice + " har ubetalte regninger");
                            }
                        }
                        notFinished = false;
                        memberList.remove(m);
                        System.out.println("Bruger: " + choice + " er blevet slettet fra medlemslisten");
                    }
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et nummer");
                scan.next();
            }
        }
    }

    public void editMember(Teams team)
    {
        while (sentinel)
        {
            System.out.println("Vælg et tal fra 0-5 for at åbne funktioner:");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | Indtast Junior Konkurrence Stats ");
            System.out.println("| 2 | Indtast Senior Konkurrence Stats ");
            System.out.println("| 3 | Ændre medlems restance");
            System.out.println("| 4 | Ændre trænings resultat hos Junior ");
            System.out.println("| 5 | Ændre trænings resultat hos Junior ");
            System.out.println("| 0 | Gå Tilbage");
            System.out.println("----------------------------------------------------------");
            try
            {
                int tal = scan.nextInt();
                System.out.println("Indtast medlems id: ");
                int choice = scan.nextInt();
                if ( tal == 1 )
                {
                    for (int i = 0; i < team.getJuniorTeam().size(); i++)
                    {
                        if (team.getJuniorTeam().get(i).getId() == choice)
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Indtast stævne: ");
                            String meet = sc.nextLine();
                            System.out.println("Indtast tid");
                            int time = sc.nextInt();
                            System.out.println("Indtast placering");
                            int placement = sc.nextInt();
                            team.getJuniorTeam().get(i).setTournamentTime(time);
                            team.getJuniorTeam().get(i).setTournament(meet);
                            team.getJuniorTeam().get(i).setPlacement(placement);
                        }
                    }
                } else if ( tal == 2 )
                {
                    for (int i = 0; i < team.getSeniorTeam().size(); i++)
                    {
                        if (team.getSeniorTeam().get(i).getId() == choice)
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Indtast stævne: ");
                            String meet = sc.nextLine();
                            System.out.println("Indtast tid");
                            int time = sc.nextInt();
                            System.out.println("Indtast placering");
                            int placement = sc.nextInt();
                            team.getSeniorTeam().get(i).setTournamentTime(time);
                            team.getSeniorTeam().get(i).setTournament(meet);
                            team.getSeniorTeam().get(i).setPlacement(placement);
                        }
                    }

                } else if ( tal == 3 )
                {
                    for (int i = 0; i < memberList.size(); i++)
                    {
                        if (memberList.get(i).getId() == choice)
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Indtast restance: ");
                            int debt = sc.nextInt();
                            memberList.get(i).setDebt(debt);
                        }
                    }
                } else if ( tal == 4 ) {
                    for (int i = 0; i < team.getJuniorTeam().size(); i++) {
                        if (team.getJuniorTeam().get(i).getId() == choice) {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Indtast restance: ");
                            int training = sc.nextInt();
                            team.getJuniorTeam().get(i).setTrainingResult(training);
                        }
                    }
                }else if ( tal == 5 )
                {
                    for (int i = 0; i < team.getSeniorTeam().size(); i++)
                    {
                        if (team.getSeniorTeam().get(i).getId() == choice)
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Indtast restance: ");
                            int training = sc.nextInt();
                            team.getSeniorTeam().get(i).setTrainingResult(training);
                        }
                    }
                } else if ( tal == 0 )
                {
                    System.out.println("Går Tilbage...");
                    Menu.menuLoop();
                    sentinel = false;
                } else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 5");
                }
            } catch (Exception e)
            {
                System.out.println("Fejl: " + e);
                scan.next();
            }


        }
    }


}
