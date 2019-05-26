public class FriendList {
   public Friend[] list;
   int num = 0;
   
   public FriendList() {
        list = new Friend[100];
   }  
   
   public int numFriends() { 
       return num;
   }
   
   public void saveFriendList(Friend input) {
	   this.list[num++] = input;
   }

   public Friend getFriend(int i) {
      return list[i];
   }
   
}
