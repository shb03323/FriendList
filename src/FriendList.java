import java.util.ArrayList;

public class FriendList {
	   ArrayList<Friend> list = new ArrayList<Friend>();

	   
//	   public FriendList() {
//	        list = new Friend[100];
//	   }  
	   
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
	   
	   public void setFriend(int i, Friend input) {
		   list.set(i, input);
	   }
	   
	}
