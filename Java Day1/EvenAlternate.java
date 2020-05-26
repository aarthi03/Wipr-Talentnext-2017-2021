import java.util.*;
public class EvenAlternate
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=100;
		for(int i=1;i<=n;i++){
		    if(i%2!=0)
		    {
		        continue;
		    }
		    System.out.println(i);
		}
	}
}