import java.util.*;
class SumofLastDigit01{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n2=s.nextInt();
int Ld=n%10;
int Ld1=n2%10;
int sum=Ld+Ld1;
System.out.println(sum);
}
}