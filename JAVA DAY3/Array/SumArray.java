import java.util.*;
public class SumArray{
public static void main(String[] args){
int sum=0;
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
float avg;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
sum=sum+a[i];
}
System.out.println("Sum="+sum);
avg=(float)sum/n;
System.out.println("Average="+avg);
}
}