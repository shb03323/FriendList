import java.io.File;
import java.util.Scanner;

public class FriendListFile {
   
	public FriendList FriendList();
	public Friend Friend();
	
    try {
    	File file = new File(fileName);
    	Scanner scan = new Scanner(file);
    	
    	while (scan.hasNext()) { 
    		String line = scan.nextLine();
    	}
    } 
    catch(Exception e) { 
    	System.out.println("ERROR!");
    }

    private Friend fix(String line) {
    	if (line.startsWith("//")) {
    		return null;
    	}
	   
    	String[] split = line.split(":");
    	try {
    		for(int i=0 ; i<5 ; i++) {
    			if(split[i] == null) {
    				split[i] = "No Data";
    			}
    		}
    		return new Friend(split[0].trim(), Integer.valueOf(split[1].trim()), split[2].trim(), split[3].trim(), split[4].trim());
    	} 
    	catch (Exception e) {
    		System.out.println("ERROR!");
    	}
    	return null;
    }
}
