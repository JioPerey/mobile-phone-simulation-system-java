
public class Contact {
	// Class fields
	private int contactId;
	private String name;
	// I used String because phone number
	// in the Philippines consist of 11 digits
	private String number;
	
	private static int idTracker = 1;
	
	// Constructor
	public Contact(String name, String number) {
		this.contactId = idTracker++;
		this.name = name;
		this.number = number;
	}
	
	// Getters
	public int getContactId() {
		return this.contactId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	@Override
	public String toString() {
		return getName() +  " - " + getNumber();
	}
}
