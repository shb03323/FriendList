import java.util.ArrayList;

public class DeleteFriend {
	public DeleteFriend(FriendListFile fileGetter, FriendListGUI input) {
		ArrayList<Integer> deleteIdx = new ArrayList<Integer>();
		
		for(int i=0;i<fileGetter.friendList.numFriends();i++) {
			if(fileGetter.friendList.getFriend(i).check==true) {
				deleteIdx.add(i);
			}
		}
		
		for(int i=deleteIdx.size()-1;i>=0;i--) {
			fileGetter.friendList.deleteFriend(deleteIdx.get(i));
		}
		input.update();
		input.frameUpdate();
	}
}
