
// Parent Class of AndroidPhone and IOSPhone Class
public class Smartphone {
	// Class fields
	private String brand;
	private Sim sim;
	
	// Constructor
	public Smartphone(String brand) {
		this.brand = brand;
		this.sim = null; // no sim at creation
	}
	
	// Getters
	public String getBrand() {
		return this.brand;
	}
	
	public Sim getSim() {
		return this.sim;
	}
	
	// Setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// Method for inserting a sim card to a phone
	public void insertSim(Sim simToInsert) {
		// Check if the value of simToInsert is null (not valid)
		if (simToInsert == null) {
			System.out.println("Failed to insert SIM.");
			System.out.println("Please insert a valid SIM.");
			return;
		}
		
		// Check if the phone has SIM already
		if (hasSim()) {
			// Ideally, we want to replace that sim
			// So we call the removeSim();
			removeSim();
		}
		
		this.sim = simToInsert;
		System.out.println("SIM inserted: " + simToInsert.getServiceProvider());
	}
	
	// Method for removing a sim card from a phone
	public void removeSim() {
		// Check if the phone has sim before we remove
		// We cannot remove a sim that doesn't exist
		if (!hasSim()) {
			System.out.println("Failed to remove SIM.");
			System.out.println("Phone doesn't have SIM.");
			return;
		}
		
		System.out.println("SIM removed: " + getSim().getServiceProvider());
		this.sim = null;
		
	}
	
	public boolean hasSim() {
		return this.sim != null;
	}
	
	
}
