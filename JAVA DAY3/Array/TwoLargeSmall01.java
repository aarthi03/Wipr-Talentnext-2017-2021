import java.util.*;
public class TwoLargeSmall01{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i;
int n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
int l1,l2,temp;
l1=a[0];
l2=a[1];
if(l1<l2){
temp=l1;
l1=l2;
l2=temp;
}
for(i=2;i<n;i++){
if(a[i]>l1){
l2=l1;
l1=a[i];
}
else if(a[i]>l2 && a[i]!=l1){
l2=a[i];
}
}
int s1,s2;
s1=a[0];
s2=a[1];
if(s1>s2){
temp=s1;
s1=s2;
s2=temp;
}
for(i=2;i<n;i++){
if(a[i]<s1){
s2=s1;
s1=a[i];
}
else if(a[i]<s2 && a[i]!=s1){
s2=a[i];
}
}
System.out.println("Two Largest Number="+l1+" "+l2);
System.out.println("Two Smallest Number="+s1+" "+s2);
}
}
