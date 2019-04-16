import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FriendListFile {

	FriendList friendList = new FriendList();

	public FriendList readFileToList(String fileName) {

		try {
			File file = new File(fileName);

			@SuppressWarnings("resource")
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				Friend fri = splitLine(input.nextLine());
				if (fri != null) {
					friendList.saveFriendList(fri);
				}
			}
		} catch (Exception e) {
			System.out.println("Unknown File");
		}
		return friendList;
	}

	private Friend splitLine(String line) {
		//System.out.println(line);
		if (line.startsWith("//") || line.startsWith("\n")) {
			return null;
		}

		String[] split = line.split(":");

		if (split.length!=5) {
			System.out.println("Irregular input line " + " ; Skip the input line : " + line);
			return null;
		}
		
		for (int i=0; i<friendList.num; i++) {
			if(friendList.getFriend(i).getName().equals(split[0].trim())) {
				System.out.println("Name Conflict");
			}
		}

		if(!isInteger(split[1].trim())) {
			System.out.println("Illegal value " + " -- " + split[1] +" ; Skip the input line : " + line);
			return null;
		}
		
		boolean contains = split[3].contains("@");
		if (!contains) {
			System.out.println("Illegal email address " + " ; Skip the input line : " + line);
			return null;
		}
		
		Friend friend = new Friend(split[0].trim(), split[1].trim(), split[2].trim(), split[3].trim(), split[4].trim());
		return friend;
	}
	
	public boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}	
	public void readListToFile() throws IOException {
		FileWriter fw = new FileWriter("out.txt");
		for(int i=0; i<friendList.numFriends(); i++) {
			fw.write(friendList.list[i].getName() + " : " + friendList.list[i].getGroup() + " : " + friendList.list[i].getNum() + " : " + friendList.list[i].getEmail() + " : " + friendList.list[i].getImg());
			fw.write("\r\n");
		}
		fw.close();
	}
}
