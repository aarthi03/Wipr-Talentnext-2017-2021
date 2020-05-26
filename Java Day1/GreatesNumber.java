import java.util.*;
public class GreatestNumber
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n1>n2){
		    System.out.println(+n1+" is greater than "+n2);
		}
		else{
		    System.out.println(+n2+ " is greater than "+n1);
		}
	}
}