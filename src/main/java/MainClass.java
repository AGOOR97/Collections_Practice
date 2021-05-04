import java.util.*;

public class MainClass
{

    public static void printExcOne()
    {
        System.out.println("====================  Question No. 1  ====================");
        String myName = "Mohmmed AlSayed Abdel-Rahman Farag Amer Agoor";
        ExcOne one = new ExcOne(myName);
        one.getInitials(myName);
    }

    public static void printExcTwo()
    {
        System.out.println("====================  Question No. 2  ====================");
        /* Note .. the attached File Named Exc2 has letter (e) = 153 time :D */
        ExcTwo two = new ExcTwo();

        System.out.println("Enter your Search Letter");
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        char letterUser = user.charAt(0);
        int count = two.getCounts("fileCount.txt" ,letterUser);
        System.out.println("Number of Letter. "  + letterUser +  "  =>   " + count + "   times");

    }

    public static void main(String[] args)
    {
        // Calling this Function , this Function call the Class ExcOne

        printExcOne();
        System.out.println("");
        System.out.println("====================  Coded By AGOOR  ====================");
        System.out.println("");
        printExcTwo();

    }
}
