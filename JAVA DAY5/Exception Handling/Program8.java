public class Program8 {

	public static void main(String[] args) throws InvalidAge {
		String name = args[0];
		
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new InvalidAge();
		
		System.out.println("Name: " + name + " Age: " + age);
	}

}