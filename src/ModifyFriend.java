
public class ModifyFriend {
	public ModifyFriend(FriendListFile fileGetter, FriendListGUI input) {
		for(int i=0;i<fileGetter.friendList.numFriends();i++) {
			if(fileGetter.friendList.getFriend(i).check == true) {
				fileGetter.friendList.getFriend(i).check = false;
				fileGetter.friendList.getFriend(i).setName(input.nameField.get(i).getText());
				fileGetter.friendList.getFriend(i).setGroup(input.groupField.get(i).getText());
				fileGetter.friendList.getFriend(i).setTel(input.telField.get(i).getText());
				fileGetter.friendList.getFriend(i).setEmail(input.emailField.get(i).getText());
				fileGetter.friendList.getFriend(i).setImg(input.imgField.get(i).getText());
			}
		}
		input.update();
		input.frameUpdate();
	}
}
