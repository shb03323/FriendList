import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FriendListFile fileGetter = new FriendListFile();
		String filePath = "SampleTest.txt";
		FriendList fri = new FriendList();
		fri = fileGetter.readFileToList(filePath);
		//System.out.println(fri.num);
		for ( int i = 0 ; i<fri.numFriends();i++) {
			
			fri.getFriend(i).print();
			//System.out.println(i);
		}
		//System.out.println(fri.numFriends());
		
		fileGetter.readListToFile();
	}

}
