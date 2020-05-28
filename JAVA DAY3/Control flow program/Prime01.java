import java.util.*;
public class Prime01{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count=count+1;
break;
}
}
if(count==0){
System.out.println("Prime");
}
else
{
System.out.println("Not a Prime");
}
}
}