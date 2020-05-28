import java.util.*;
public class ColorCode01{
public static void main(String args[]){
char ch=args[0].charAt(0);
switch(ch){
case 'R':System.out.println("R->Red");
break;
case 'G':System.out.println("G->Green");
break;
case 'B':System.out.println("B->Blue");
break;
case 'Y':System.out.println("Y->Yellow");
break;
case 'O':System.out.println("O->Orange");
break;
case 'W':System.out.println("W->White");
break;
default:System.out.println("Invalid code");
break;
}
}
}