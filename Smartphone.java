
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
	
	public boolean hasSim() {
		return this.sim != null;
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
	
	// Wrapper method for adding contact, so we can call addContact through
	// Smartphone Class (and its child classes)
	public void addContact(Contact contactToAdd) {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to add contact.");
			return;
		}
		
		getSim().addContact(contactToAdd);
	}
	
	// Wrapper method for topping up load, so we can call topUpLoad through
	// Smartphone Class (and its child classes)
	public void topUpLoad(double topUpAmount) {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to top up load.");
			return;
		}
		
		getSim().topUpLoad(topUpAmount);
	}
	
	// Wrapper method for printing contacts, so we can call printContacts through
	// Smartphone Class (and its child classes)
	public void printContacts() {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to see your phonebook.");
			return;
		}
		
		getSim().printContacts();
	}
	
	// Wrapper method for sending message/s, so we can call sendMessage through
	// Smartphone Class (and its child classes)
	public void sendMessage(int noOfMessages) {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to send message/s");
			return;
		}
		
		getSim().sendMessage(noOfMessages);
	}
	
	
	// Wrapper method for making a call, so we can call makeCall through
	// Smartphone Class (and its child classes)
	public void makeCall(int durationInMinutes) {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to make a call.");
			return;
		}
		
		getSim().makeCall(durationInMinutes);
	}
	
	// Wrapper method for making a call, so we can call makeCall through
	// Smartphone Class (and its child classes)
	public void removeContact(String contactToRemove) {
		
		if (!hasSim()) {
			System.out.println("No SIM. Insert a SIM to remove contact/s");
			return;
		}
		
		getSim().removeContact(contactToRemove);
	}
		
}











