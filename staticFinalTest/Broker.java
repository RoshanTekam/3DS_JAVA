package com.staticFinalTest;

public class Broker {

	FlatOwner flatOwner;
	User user;

	public FlatOwner searchFlat(FlatOwner flatOwner, User user) {
		if (flatOwner.getLocation().equals(user.getLocation())) {
			return flatOwner;
		} else {
			return null;
		}
	}

}
