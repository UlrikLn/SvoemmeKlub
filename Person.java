public class Person
{
    String name = "Uganda";
    int age = -99;
    int kontingent = -100;
    boolean medlemsskab;
    int id = 0;
    int restance = -9999;

    public Person (int id, String n, int a, boolean m, int r)
    {
        this.id++;
        name = n;
        age = a;
        medlemsskab = m;
        restance = r;


    }

    
    public int whatMember() 
    {
        if (medlemsskab == true) 
        {
            if (age < 18)
            {                
                kontingent = 1000;
                System.out.println(Junior kontingent);
            }
            else if (age >= 17 && age < 60)
            {
              kontingent = 1600;
              System.out.println(Senior kontingent);
            }
            else if (age > 60)
            {
                kontingent = 1200;
                System.out.println(Pensionist kontingent);
            }
        }
        else if (medlemsskab == false)
        {
            kontingent = 500;
            System.out.println(kontingent);
        }
        return kontingent;
    }
}
