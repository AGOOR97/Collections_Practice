import java.util.*;
import java.io.*;

public class ExcTwo
{
    public ExcTwo(){}


    // this Function is to return count of specified letter
    // it takes the file path and that letter as shown
    public int getCounts(String fileName , char letter)
    {
        int countValue = 0;

        try(FileReader file = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(file))
        {
            String sCurrentLine;
            while ((sCurrentLine = bf.readLine()) != null)
            {
                for (int i = 0; i <sCurrentLine.length() ; i++)
                {
                    if(sCurrentLine.charAt(i) == letter)
                    {
                        countValue += 1;
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return countValue;

    }

}
