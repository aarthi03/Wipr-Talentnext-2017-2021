public class Registration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountry {
		if (!userCountry.equals("India"))
			throw new InvalidCountry();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		
		Registration registration = new Registration();
		
		try {
			
			registration.registerUser("Mini", "India");
		} catch (InvalidCountry e) {
			System.out.println(e.getMessage());
		}
	}

}