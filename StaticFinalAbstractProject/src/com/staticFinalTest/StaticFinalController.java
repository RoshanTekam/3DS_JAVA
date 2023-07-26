package com.staticFinalTest;

public class StaticFinalController {

	public static void main(String[] args) {

		User userObj1 = new User(101, "1 BHK", 10000, "Hinjewadi phase 1");
		User userObj2 = new User(102, "2 BHK", 25000, "Bhumkar chowk");

		FlatOwner flatOwnerObj1 = new FlatOwner("2 BHK", "Bhumkar chowk", 24000);
		FlatOwner flatOwnerObj2 = new FlatOwner("1 BHK", "Bhumkar chowk", 15000);

		Broker broker = new Broker();
		FlatOwner ownerDetails = broker.searchFlat(flatOwnerObj1, userObj2);
		System.out.println(ownerDetails.toString());
		
		

	}

}
 