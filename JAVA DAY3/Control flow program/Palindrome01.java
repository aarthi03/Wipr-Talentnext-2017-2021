import java.util.*;
public class Palindrome01{
public static void main(String args[]){
int n,r,reverse=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int temp=n;
while(n!=0){
r=n%10;
reverse=reverse*10+r;
n=n/10;
}
if(reverse==temp)
	System.out.println(temp+" is a palindrome");
else
	System.out.println(temp+" is not a palindrome");
}

}