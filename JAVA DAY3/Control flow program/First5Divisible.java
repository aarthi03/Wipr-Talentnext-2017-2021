import java.util.*;
public class First5Divisible{
public static void main(String[]args){
int c=1;

for(int i=1;c<=5;i++){
if(i%2==0  && i%3==0 && i%5==0){
c=c+1;
System.out.println(i);
}
}
}
}

