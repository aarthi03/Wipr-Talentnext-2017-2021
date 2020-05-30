import java.util.*;
import java.io.*;
public class PrintCondition01 
{
    public static void main(String[] args) 
    {
		String str1 = "ASFzvdf124afdfh"; 
		String str2 = "AB";
		StringBuffer s= new StringBuffer();
        while (str1.indexOf(str2) != -1) 
        {	
			int index = str1.indexOf(str2);
            if (index == 0 && index + str2.length() < str1.length() - 1) 
            {
				s.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
            if (index - 1 >= 0 && index + str2.length() >= str1.length()) 
            {
				s.append(str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
            if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) 
            {
				s.append(str1.charAt(index - 1));
				s.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}
        System.out.println(s);
	}
 }