
// AndroidPhone inherits constructor, fields, and methods of Smartphone Class
public class AndroidPhone extends Smartphone {
	// Class fields
	private int androidPhoneId;
	
	private static int idTracker = 1;
	
	// Constructor
	public AndroidPhone(String brand) {
		super(brand);
		this.androidPhoneId = idTracker++;
		System.out.println("Android Phone was created!");
		System.out.println("Brand: " + super.getBrand());
	}
	
	// Getters
	public int getAndroidPhoneId() {
		return this.androidPhoneId;
	}
}
