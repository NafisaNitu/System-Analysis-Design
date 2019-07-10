public class GeneralizationTest {

	public static void main(String[] s) {
		Admin adminInstance = new Admin();
		adminInstance.setName("Nitu Akter");

		System.out.println(adminInstance);

		Customer c = new Customer("171442639", "karanigonj, Dhaka, Bangladesh");
		System.out.println(c);
	}
}
