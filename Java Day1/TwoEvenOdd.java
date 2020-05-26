import java.util.*;
public class TwoEvenOdd
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=n+n1;
		if(n2%2==0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}
}