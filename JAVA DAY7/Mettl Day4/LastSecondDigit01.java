import java.util.*;
class LastSecondDigit01{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int Ld=n%100;
int Lsd=Ld/10;
System.out.println(Lsd);
}
}