import java.io.File;
import java.util.Scanner;

public class FriendListFile {
  
    public FriendListFile(String fileName) {
        
    	FriendList getFriendList = new FriendList();
        File file = new File(fileName);
        Scanner scan;
        try {
            scan = new Scanner(file);
        } 
        catch (Exception e) {
            System.out.println("Error");
        }
        
        while (scan.hasNextLine() && getFriendList.numFriends() <= 100) {
            Friend newFriend = fitter(scan.nextLine());
        }

        return getFriendList;
    }

    private Friend fitter(String line) {
        if (line.startsWith("//")) {
            return null;
        }
        String[] splitString = line.split(":");
        try {
            return new Friend(splitString[0].trim(), Integer.valueOf(splitString[1].trim()), splitString[2].trim(), splitString[3].trim(), splitString[4].trim());
        } 
        
        catch (Exception e) {
            System.out.println("error at line : \"" + line + "\"");
        }
        return null;
    }

}