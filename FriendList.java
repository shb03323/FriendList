
public class FriendList {
   private Friend[] list;
   public FriendList() {
        this.list = new Friend[100];
    }
   
   public int numFriends() {
        return list.length;
    }

   public Friend getFriend(int i) {
      try {
         return list[i];
      }
      catch(Exception e) {
         return null;
      }
   }
   
   public Friend[] getList() {
      return list;
   }
}
