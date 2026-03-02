
// IOSPhone inherits constructor, fields, and methods of Smartphone Class
public class IOSPhone extends Smartphone{
	// Class fields
	private int iosPhoneId;
	
	private static int idTracker = 1;
	
	// Constructor 
	public IOSPhone(String brand) {
		super(brand);
		this.iosPhoneId = idTracker++;
		System.out.println("iOS Phone was created!");
		System.out.println("Brand: " + super.getBrand());
	}
	
	// Getters
	public int getIosPhoneId() {
		return this.iosPhoneId;
	}
	
}
