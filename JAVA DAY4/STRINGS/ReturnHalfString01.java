import java.util.*;
import java.io.*;
public class ReturnHalfString01 
{
    public static void main(String[] args) 
    {
		String str = "LivingNonliving";
		String res;
        if (str.length() % 2 == 0) 
        {
			res = str.substring(0, str.length() / 2);
        } 
        else 
        {
			res = null;
		}
		
		System.out.println(res);
	}

}