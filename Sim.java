import java.util.ArrayList;
import java.util.List;

public class Sim {
	// Class fields
	private int simId;
	private String serviceProvider;
	private List<Contact> contacts;
	private double loadBalance;
	
	private static int idTracker = 1;
	
	// Constructor
	public Sim(String serviceProvider) {
		this.simId = idTracker++;
		this.serviceProvider = serviceProvider;
		this.contacts = new ArrayList<Contact>();
		this.loadBalance = 0.00;
	}
	
	// Getters
	public int getSimId() {
		return this.simId;
	}
	
	public String getServiceProvider() {
		return this.serviceProvider;
	}
	
	public double getLoadBalance() {
		return this.loadBalance;
	}
	
	// Methods
	
	// Method for adding contact to the SIM
	public void addContact(Contact contactToAdd) {
		// Check if the contact to be added
		// is null (not valid)
		if (contactToAdd == null) {
			System.out.println("Failed to add contact.");
			return;
		}
		
		this.contacts.add(contactToAdd);
		System.out.println(contactToAdd.getName() + " added to SIM.");
	}
	
	// Method for topping up load
	public void topUpLoad(double topUpAmount) {
		// Check if the top up amount is valid (greater than 0)
		// We cannot top up values less than 1
		// that's why it is called "top up"
		if (topUpAmount <= 0) {
			System.out.println("Invalid top up amount.");
			System.out.println("Top up amout must be greater than \"0\".");
			return;
		}
		
		this.loadBalance += topUpAmount;
		System.out.println("Load added: " + topUpAmount + " pesos");
		System.out.println("Total balance: " + getLoadBalance() + " pesos");
	}
	
	// Method that prints all contact in the contacts list
	public void printContacts() {
		// Check if there's a contact in the contacts list
		if (contacts.isEmpty()) {
			System.out.println("No saved contact/s.");
			return;
		}
		
		// Traverse the contacts list
		System.out.println("Contacts stored in SIM " + getServiceProvider() + ": ");
		for (int index = 0; index < contacts.size(); index++) {
			System.out.println((index + 1) + "." + contacts.get(index));
		}
	}

	// Method for sending message/s
	public void sendMessage(int noOfMessages) {
		// Check if number of messages is valid
		if (noOfMessages < 1) {
			System.out.println("Invalid number of messages.");
			return;
		}
		
		// Check if SIM has sufficient load balance
		// to send message/s
		if ((double) noOfMessages > getLoadBalance()) {
			System.out.println("Failed to send message.");
			System.out.println("Insufficient Load Balance.");
			System.out.println("Load Balance: " + getLoadBalance() + " pesos");
			return;
		}
		
		// Deduct the noOfMessages directly since 1 message = 1 peso
		this.loadBalance -= noOfMessages;
		System.out.println("Message sent (" + noOfMessages + " pesos deducted)");
		System.out.println("Remaining load: " + getLoadBalance() + " pesos");
	}
	
	// Method for making a call
	public void makeCall(int durationInMinutes) {
		// Check if call duration is valid
		if (durationInMinutes < 1) {
			System.out.println("Invalid call duration.");
			return;
		}
		
		// Compute the cost of the call
		double callCost = computeCallCost(durationInMinutes);
		
		// Check if the cost of the call is greater than
		// the load balance
		if (callCost > getLoadBalance()) {
			System.out.println("Call cancelled.");
			System.out.println("Insufficient Load Balance.");
			System.out.println("Load Balance: " + getLoadBalance() + " pesos");
			return;
		}
		
		// Deduct the cost of the call to the load balance
		this.loadBalance -= callCost;
		System.out.println("Call ended.");
		System.out.println("Call duration: " + durationInMinutes + " minutes");
		System.out.println("Call Cost: " + callCost + " pesos");
		System.out.println("Remaining load: " + getLoadBalance() + " pesos");
	}
	
	// Helper method that computes the cost of the call
	// depending on the duration of the call
	private double computeCallCost(int durationInMinutes) {
		return durationInMinutes * 3.0; // 3 pesos per minute
	}
	
	// Method for removing a contact from the contacts list
	public void removeContact(String contactToRemove) {
		// We can use the built-in contains() and remove() of array list for this 
		// (more efficient) but to showcase my knowledge about traversing we'll
		// do this approach: 
		
		// Loop through the contacts list to find the contact to be remove
		for(int index = 0; index < contacts.size(); index++) {
			if (contacts.get(index).getName().equalsIgnoreCase(contactToRemove)) {
				System.out.println(contacts.get(index).getName() + " removed from SIM.");
				contacts.remove(index);
				return;
			}
		}
		
		System.out.println(contactToRemove + " doesn't exists in your contacts.");
	}
	
}



