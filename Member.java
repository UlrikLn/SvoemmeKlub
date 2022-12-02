import java.text.*;
import java.util.*;
import java.io.*;
public class Member
{
    private int id = -99;
    private String gender = "andet";
    private String firstName = "John";
    private String surname = "Dillermand";
    private int birthday = -99;
    private int subscription = -99;
    // medlemmet kan være 3 forskellige membertypes: Competitor, Excerciser og Passiv
    private String memberType = "Prut";
    // Hvis medlemmets membership status er false, er medlemmet en Passiv memeberType
    boolean membershipActive = true;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yy");



    public Member()
    {

    }

    // Constructors
    public Member (int id, String gender, String firstName, String surname, int birthday, int subscription, String memberType, boolean membershipActive)throws ParseException
    {
        this.id = id;
        this.gender = gender;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.subscription = subscription;
        this.memberType = memberType;
        this.membershipActive = membershipActive;
    }
    // Getters

    public int getId()
    {
        return id;
    }

    public int getSubscription()
    {
        return subscription;
    }

    public String getGender()
    {
        return gender;
    }

    public String getFullName()
    {
        return firstName + " " + surname;
    }

    public int getBirthday()
    {
        return birthday;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public boolean getMembershipActive()
    {
        return membershipActive;
    }

    // Setters

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setMembertype(String memberType)
    {
        this.memberType = memberType;
    }

    public void setMembership(boolean membership)
    {
        this.membershipActive = membership;
    }

    public void setSubscription(int subscription)
    {
        this.subscription = subscription;
    }

    public String toString()
    {
        if(getMembershipActive() == true)
        {
            String subs = "dummy";
            if (getSubscription() == 0)
            {
                subs = ", Kontingent: [Betalt]";
            }
            else if (getSubscription() > 0)
            {
                subs =  ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname +
                    ", Alder: " + birthday + ", Medlemskab: [AKTIV]" + subs;

        }
        else
        {
            String subs = "dummy";
            if (getSubscription() == 0)
            {
                subs = ", Kontingent: [Betalt]";
            }
            else if (getSubscription() > 0)
            {
                subs =  ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname +
                    ", Alder: " + birthday + ", Medlemskab: [PASSIV]" + subs;


        }

    }
    public int whatSubcription()
    {
        if (getMembershipActive() == true)
        {
            if (getBirthday() < 18)
            {
                setSubscription(1000);
                System.out.println("Junior medlemsskab (pris: " + getSubscription() + "kr.)");
            }
            else if (getBirthday() >= 17 && getBirthday() < 60)
            {
                setSubscription(1600);
              System.out.println("Senior medlemsskab (pris: " + getSubscription() + "kr.)");
            }
            else if (getBirthday() > 60)
            {
                setSubscription(1200);
                System.out.println("Pensionist medlemsskab (pris: " + getSubscription() + "kr.)");
            }
        }
        else if (getMembershipActive() == false)
        {
            setSubscription(500);
            System.out.println("Passivt medlemsskab (pris: " + getSubscription() + "kr.)");
        }
        return getSubscription();
    }

    public void sleep()
    {
        try
        {
            Thread.sleep(1200);
        }
        catch (InterruptedException d)
        {
            System.out.println("Fejl: " + d);
        }
    }


    
}
