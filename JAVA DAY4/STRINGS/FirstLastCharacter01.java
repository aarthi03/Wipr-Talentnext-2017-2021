import java.io.*;
import java.util.*;
public class FirstLastCharacter01 
{
    public static void main(String[] args) 
    {
		String str = "Intel";
		str = str.substring(1, str.length() - 1);
		System.out.println(str);
	}
}