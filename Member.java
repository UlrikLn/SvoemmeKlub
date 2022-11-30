import java.text.*;
import java.util.*;
public class Member
{
    private int id = -99;
    private String gender = "andet";
    private String firstName = "John";
    private String surname = "Dillermand";
    private Date birthday;
    private int subscription = -99;
    // medlemmet kan være 3 forskellige membertypes: Competitor, Excerciser og Passiv
    private String memberType = "Prut";
    // Hvis medlemmets membership status er false, er medlemmet en Passiv memeberType
    boolean membershipActive = true;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yy");

    ArrayList<Member> memberList = new ArrayList<>();

    // Constructors
    public Member (int id, String gender, String firstName, String surname, Date birthday, int subscription, String memberType, boolean membershipActive)
    {
        this.id = id;
        this.gender = gender;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = dateFormat.parse(birthday);
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

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurname()
    {
        return surname;
    }

    public Date getBirthday()
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

    public String toString()
    {
        if(getMembershipActive() == true)
        {
            String subs = "dummy";
            if (getSubscription() == 0)
            {
                subs = ", Kontingent: [Betalt]";
            }
            else if (subscription > 0)
            {
                subs =  ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname +
                    ", Fødeselsdag: " + birthday.getDate() + "-" + birthday.getMonth() + 1 + "/" + birthday.getYear()
                    + ", Medlemskab: [AKTIV]" + subs;

        }
        else
        {
            String subs = "dummy";
            if (getSubscription() == 0)
            {
                subs = ", Kontingent: [Betalt]";
            }
            else if (subscription > 0)
            {
                subs =  ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname +
                    ", Fødeselsdag: " + birthday.getDate() + "-" + birthday.getMonth() + 1 + "/" + birthday.getYear()
                    + ", Medlemskab: [PASSIV]" + subs;


        }

    }




    /*public int whatMember()
    {
        if (membership == true)
        {
            if (age < 18)
            {
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            }
            else if (age >= 17 && age < 60)
            {
                subscription = 1600;
              System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
            }
            else if (age > 60)
            {
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");
            }
        }
        else if (membership == false)
        {
            subscription = 500;
            System.out.println("Passivt medlemsskab (pris: " + subscription + "kr.)");
        }
        return subscription;
    }*/
    
}
