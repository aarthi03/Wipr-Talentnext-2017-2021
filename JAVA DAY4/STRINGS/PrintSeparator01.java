import java.util.*;
import java.io.*;
public class PrintSeparator01 
{
    public static void main(String[] args) 
    {
		String str1 = "Aarthi";
		String str2 = "L";
		int n= 3;
		StringBuffer s = new StringBuffer();
        for (int i = 0 ; i < n; i++)
        { 
            s.append(str1).append(str2);
        }
		System.out.println(s);
	}
}