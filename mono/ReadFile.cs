using System;
using System.Collections.Generic;
using System.Collections;

public class ReadFile
{
    static public void Main()
    {
        IList<Int32> res = new List<Int32>();
        String line;
        System.IO.StreamReader file = new System.IO.StreamReader("../data/numbers.txt");
        while( (line = file.ReadLine()) != null)
        {
            try
            {
                Int32 nmb = Int32.Parse(line);
                res.Add(nmb);
            }
            catch (Exception)
            {
                Console.WriteLine(String.Format("Line {0} cannot be parsed to int", line));
            }
        }
        file.Close();
        foreach(int nmb in res)
        {
            Console.WriteLine(nmb);
        }
    }
}
