import java.util.*;
public class Reverse01{
public static void main(String args[]){
int n,r,reverse=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0){
r=n%10;
reverse=reverse*10+r;
n=n/10;
}
System.out.println(reverse);
}
}