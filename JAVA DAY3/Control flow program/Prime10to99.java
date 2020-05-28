import java.util.*;
public class Prime10to99{
	public static void main(String[] args){
	int n=10;
	int m=99;
	int flag;
	for(int i=n;i<=m;i++){
		flag=0;
		for(int j=2;j<=i/2;j++){
			if(i%j==0){
			flag=1;
			break;
			}
		}
		if(flag==0){
			System.out.println(i);
		}
	}
	}
}