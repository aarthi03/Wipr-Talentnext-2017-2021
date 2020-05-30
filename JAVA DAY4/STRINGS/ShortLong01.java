import java.io.*;
import java.util.*;
public class ShortLong01 
{
    public static void main(String[] args) 
    {
		String a = "hello";
		String b = "hi";
		String res;
        if (a.length() < b.length()) 
        {
			res = a + b + a;
        }
        else
        {
			res = b + a + b;
        }
		System.out.println(res);
	}  
}