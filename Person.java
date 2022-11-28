public class Person
{
    String name = "Uganda";
    int age = -99;
    int kontingent = -100;
    boolean medlemsskab;

    public int whatMember() 
    {
        if (medlemsskab == true) {
            if (age < 18)
            {
                // indsæt medlemsskab ungdomssvømmere 1000kr i arraylist.
                System.out.println("hello");
                return kontingent = 1000;
            }
            else if (age >= 17 && age < 60)
            {
                // indsæt medlemsskab seniorsvømmere 1600kr i arraylist
                System.out.println("hello");
                return kontingent = 1600;
            }
            else if (age > 60)
            {
                // // indsæt medlemsskab pensionist 25% af seniortakst 1600kr (1200kr) i arraylist
                System.out.println("hello");
                return kontingent = 1200;
            }
        }
        else if (medlemsskab == false)
        {
            return kontingent = 500;
            //System.out.println("hello");
        }
        return kontingent;
    }
}
