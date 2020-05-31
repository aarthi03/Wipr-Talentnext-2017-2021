public class InvalidCountry extends Exception {
	public InvalidCountry() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}