package com.herojeff02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class FriendListFile {
    private File file;
    private FriendList friendList;

    public FriendListFile(FriendList friendList) {
        this.friendList = friendList;
    }

    public FriendList readFileToList(String fileName) {
        try {
            file = new File(fileName);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                Friend newFriend = fitter(scan.nextLine());
                if (newFriend != null) {
                    friendList.addFriendObject(newFriend);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        }

        return friendList;
    }

    public boolean saveListToFile(String fileName) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }

        for (Friend friend : friendList.getFriendList()) {
            writer.println(friend.getName() + " : " + friend.getGroup() + " : " + friend.getPhoneNumber() + " : " + friend.getEmail() + " : " + friend.getProfilePic());
        }
        writer.close();
        return true;
    }

    private Friend fitter(String line) {
        if (line.startsWith("//")) {
            return null;
        }
        String[] splitString = line.split(":");
        try {
            return new Friend(splitString[0].trim(), Integer.valueOf(splitString[1].trim()), splitString[2].trim(), splitString[3].trim(), splitString[4].trim());
        } catch (Exception e) {
            System.out.println("error at line : \"" + line + "\"");
        }
        return null;
    }
}
