public class Main {

	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Nitu Akter";

		String customerState = "Dhaka";
		String customerCity = "karanigonj";
		String customerCountry =  "Bangladesh";
		System.out.println(a);

		Address address1=new Address(customerCity, customerState, customerCountry);
		Customer c = new Customer("Nitu Akter) (171442639)", address1);

		System.out.println(c);
	}
}
