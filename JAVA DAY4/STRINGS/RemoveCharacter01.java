import java.util.*;
import java.io.*;
public class RemoveCharacter01 
{
    public static void main(String[] args) 
    {
		String str = "aar*thi";
		String[] str1 = str.split(".[\\*]+.");
		StringBuffer s = new StringBuffer();
        for (String x : str1)
        {
			s.append(x);
        }
		System.out.println(s);
    }
}