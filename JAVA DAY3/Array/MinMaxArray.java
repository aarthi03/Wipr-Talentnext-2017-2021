import java.util.*;
public class MinMaxArray{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
int i;
int n=s.nextInt();
int a[]=new int[n];

for(i=0;i<n;i++){
a[i]=s.nextInt();
}
int min=a[0];
for(i=1;i<n;i++){
if(a[i]<min){
min=a[i];
}
}
int max=a[0];
for(i=1;i<n;i++){
if(a[i]>max){
max=a[i];
}
}
System.out.println("Minimum="+min);
System.out.println("Maximum="+max);
}
}