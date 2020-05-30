import java.util.*;
import java.io.*;
public class Palindrome01
{
    public static void main(String[] args) 
    {
        System.out.print("Enter any string : ");
        Scanner s = new Scanner(System.in);
        String Str = s.nextLine();
        String rev = "";
        char[] c = Str.toCharArray();
        for( int i = c.length-1;i>=0;i--) 
        {
            rev = revStr+c[i];
        }
        if (Str.equals(rev)) 
        {
            System.out.println("String is a palindrome.");
        } 
        else 
        {
            System.out.println("String is not a palindrome.");
        }
    }
}