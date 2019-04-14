

public class FriendList {
    private Friend[] friendArrayList;

    public FriendList() {
        this.friendArrayList = new Friend[0];
    }

    public Friend[] searchByName(String target) {
        Friend[] returnArray = new Friend[0];
        for (Friend here : friendArrayList) {
            if (here.getName().equals(target)) {
                returnArray = addToFriendArray(returnArray, here);
            }
        }
        return returnArray;
    }

    public Friend[] searchByEmail(String target) {
        Friend[] returnArray = new Friend[0];
        for (Friend here : friendArrayList) {
            if (here.getEmail().equals(target)) {
                returnArray = addToFriendArray(returnArray, here);
            }
        }
        return returnArray;
    }

    public Friend[] searchByGroup(int target) {
        Friend[] returnArray = new Friend[0];
        for (Friend here : friendArrayList) {
            if (here.getGroup() == target) {
                returnArray = addToFriendArray(returnArray, here);
            }
        }
        return returnArray;
    }

    public Friend[] searchByPhoneNumber(String target) {
        Friend[] returnArray = new Friend[0];
        for (Friend here : friendArrayList) {
            if (here.getPhoneNumber().equals(target)) {
                returnArray = addToFriendArray(returnArray, here);
            }
        }
        return returnArray;
    }

    public Friend[] searchByProfilePic(String target) {
        Friend[] returnArray = new Friend[0];
        for (Friend here : friendArrayList) {
            if (here.getProfilePic().equals(target)) {
                returnArray = addToFriendArray(returnArray, here);
            }
        }
        return returnArray;
    }


    public boolean deleteFriendObjectAt(int index) {
        if (friendArrayList.length == 0) {
            return false;
        }

        Friend[] temp = new Friend[friendArrayList.length - 1];
        try {
            for (int i = 0; i < index; i++) {
                temp[i] = friendArrayList[i];
            }
            for (int i = index; i < friendArrayList.length - 1; i++) {
                temp[i] = friendArrayList[i + 1];
            }
        } catch (Exception e) {
            return false;
        }

        friendArrayList = temp;
        return true;
    }

    public boolean addFriendObject(Friend newFriend) {
        try {
            friendArrayList = addToFriendArray(friendArrayList, newFriend);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public int numFriends() {
        return friendArrayList.length;
    }

    public Friend getFriend(int i) {
        try {
            return friendArrayList[i];
        } catch (Exception e) {
            return null;
        }
    }

    private Friend[] addToFriendArray(Friend[] target, Friend newObject) {
        Friend[] returnArray = new Friend[target.length + 1];

        for (int i = 0; i < target.length; i++) {
            returnArray[i] = target[i];
        }
        returnArray[target.length] = newObject;

        return returnArray;
    }

    public void printAll() {
        for (Friend friend : friendArrayList) {
            friend.print();
        }
    }

    public Friend[] getFriendList() {
        return friendArrayList;
    }
}
