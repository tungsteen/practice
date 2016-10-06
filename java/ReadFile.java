import java.io.*;
import java.util.*;

public class ReadFile {

    public static void main(String[] args)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        try 
        {
            try(BufferedReader br = new BufferedReader(new FileReader("../data/numbers.txt")))
            {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while(line != null)
                {
                    try
                    {
                        res.add(Integer.parseInt(line));
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Line " + line + " cannot be parsed");
                    }
                    line = br.readLine();
                }
            }
        }
        catch (Exception e)
        {
        }
        System.out.println(res);
    }
}
