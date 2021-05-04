public class ExcOne
{


    // Define Attributes
    private String name;

    // Define Constructor
    public ExcOne (String userName)
    {
        name = userName;
    }


    //Define the Function that gets the Initials of My Name
    public void getInitials(String userName)
    {
        if(userName. length() == 0)
        {
            System.out.println("There is no given Name");
        }

        if (name.charAt(0) != ' ')
        {
            System.out.println("Letter No. 0 " + " ===>> " + name.charAt(0));
        }

        for (int i = 0; i < name.length() ; i++)
        {

            if(name.charAt(i) == ' ')
            {
                System.out.println("Letter No.  " +  (i+1) + "  ===>>  " + name.charAt(i+1));
            }
        }

    }
}
