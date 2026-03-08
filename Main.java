
public class Main {

	public static void main(String[] args) {
		System.out.println("===== Test Case 1 =====");
		// Creating instance of AndroidPhone and IOSPhone Class
		AndroidPhone androidPhone1 = new AndroidPhone("Samsung S23 Ultra");
		System.out.println();
		IOSPhone iosPhone1 = new IOSPhone("Iphone 17 Pro Max");
		
		System.out.println("\n===== Test Case 2 =====");
		// Creating instances of Sim Class
		Sim sim1 = new Sim("Smart Telecom");
		Sim sim2 = new Sim("Globe Telecom");
		Sim sim3 = null;
		
		// Call the insertSim() through a phone object
		System.out.println("Trying to insert invalid SIM: ");
		iosPhone1.insertSim(sim3); // sim3 == null
		
		System.out.println("\nInserting valid SIM: ");
		iosPhone1.insertSim(sim2);
		
		System.out.println("\nInserting new SIM to a phone that has SIM: ");
		iosPhone1.insertSim(sim1);
		
		
		System.out.println("\n===== Test Case 3 =====");
		// Creating instances of Contact Class so we can add it to our SIM
		Contact contact1 = new Contact("Juan Dela Cruz", "09123456789");
		Contact contact2 = new Contact("Maria Clara", "09987654321");
		Contact contact3 = null;
		
		System.out.println("Trying to add invalid contact: ");
		iosPhone1.addContact(contact3); // contact3 == null
		
		System.out.println("\nAdding valid contacts: ");
		// Adding new contact
		iosPhone1.addContact(contact1);
		iosPhone1.addContact(contact2);
		
		
		System.out.println("\n===== Test Case 4 =====");
		System.out.println("Trying to top up invalid amount:");
		iosPhone1.topUpLoad(0);
		
		System.out.println("\nTopping up valid amount: ");
		iosPhone1.topUpLoad(20.0);
		
		
		System.out.println("\n===== Test Case 5 =====");
		// Calling the printContacts method
		iosPhone1.printContacts();
		
		
		System.out.println("\n===== Test Case 6 =====");
		// Calling the sendMessage() method
		System.out.println("Trying to send invalid number of message/s:");
		iosPhone1.sendMessage(0); // sending 0 message (doesn't make sense)
		
		System.out.println("\nSending valid number of message/s:");
		iosPhone1.sendMessage(1);
		
		// Calling the makeCall() method
		System.out.println("\nTrying to make a call with invalid number of minutes: ");
		iosPhone1.makeCall(-1); // making a -1 minute call (doesn't make sense)
		
		System.out.println("\nMaking a valid call: ");
		iosPhone1.makeCall(4);
		
		System.out.println("\nSend messages to deplete the load balance:");
		iosPhone1.sendMessage(7);
		
		System.out.println("\nTrying to send message & make call with a 0 load balance:");
		iosPhone1.sendMessage(1);
		System.out.println();
		iosPhone1.makeCall(1);
		
		
		System.out.println("\n===== Test Case 7 =====");
		// Calling the removeContact() method
		System.out.println("Removing non-existing contact: ");
		String contactToRemove1 = "Jio Perey";
		iosPhone1.removeContact(contactToRemove1);
		
		System.out.println("\nRemoving existing contact: ");
		String contactToRemove2 = "Maria Clara";
		iosPhone1.removeContact(contactToRemove2);
		
		System.out.println("\n===== Test Case 8 =====");
		iosPhone1.removeSim();
		
		
		System.out.println("\n\nDeveloped By: Jio Perey (03/03/26)");
	}

}
