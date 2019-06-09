import java.util.ArrayList;

public class FriendList {
	   ArrayList<Friend> list = new ArrayList<Friend>();
	   
	   public int numFriends() { 
	       return list.size();
	   }
	   
	   public void addFriend(Friend input) {
		   list.add(input);
	   }

	   public Friend getFriend(int i) {
	      return list.get(i);
	   }
	   
	   public void deleteFriend(int i) {
		   list.remove(i);
	   }   
	}
