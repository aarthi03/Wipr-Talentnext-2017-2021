import java.util.*;
class Alphabetical01
{
    public static void main (String[] args)
    {
     Scanner sc=new Scanner(System.in);
     char c = sc.next().charAt(0); 
    char d = sc.next().charAt(0); 
     if(c<d){
	System.out.println(c+","+d);
	}
     else{
	System.out.println(d+","+c);
}
     }
}