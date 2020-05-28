public class CheckPrime01{
	public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	int c=0;
	if(args.length==0){
		System.out.println("Please enter a number");
	}
	else if(n==0 || n==1){
		System.out.println(n+" is neither a prime nor a composite");
	}
	else{
		for(int i=2;i<=n/2;i++){
		     if(n%i==0){
			c=c+1;
		     }
		}
	}
	if(c==0){
		System.out.println("Prime");
	}
	else{
		System.out.println("Not a Prime");
}
}
}

