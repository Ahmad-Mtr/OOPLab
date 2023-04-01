package Lab_Assignment_3;


/**
 * Write a description of class classClerk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clerk
{
    // instance variables - replace the example below with your own
    private String name;
    private String phoneNb;

    /**
     * Constructor for objects of class classClerk
     */
    public Clerk(String name, String phoneNb)
    {
        // initialise instance variables
        this.name= name;
        this.phoneNb = phoneNb;
    }


//     public void setName(String name)
//     {
//         this.name = name;
//     }

    public String getName()
    {
        return name;
    }

//     public void setPhoneNb(String phoneNb)
//     {
//         this.phoneNb = phoneNb;
//     }

    public String getPhoneNb()
    {
        return phoneNb;
    }
}
