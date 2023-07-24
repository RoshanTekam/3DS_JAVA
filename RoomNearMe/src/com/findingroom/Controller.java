package com.findingroom;

public class Controller {

	public static void main(String[] args) {

		User user = new User("Vishal", 12312312345L, "Hinjewadi phase 1");
		RoomOwner owner = new RoomOwner("Hinjewadi phase 1", 5000);
		Broker broker = new Broker();
		RoomOwner owner2 = broker.userAndOwnerDetails(user, owner);

		System.out.println(owner2.ownerLocation + " " + owner2.rentCharge);

	}

}
