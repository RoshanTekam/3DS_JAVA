package com.findingroom;
import com.findingroom.User;
public class Broker {
	
	public RoomOwner userAndOwnerDetails(User user,RoomOwner owner)
	{
		if(user.userLocation.equals(owner.ownerLocation))
		{
			return owner;
		}
		return null;
	}

}
