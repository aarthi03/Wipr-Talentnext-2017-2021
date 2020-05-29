import java.util.*;
public class SearchArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int index=-1;
int a[]={1,4,34,56,7};
int search=s.nextInt();
for(int i=0;i<a.length;i++){
if(a[i]==search){
index=i;
break;
}
}
System.out.println(index);
}
}