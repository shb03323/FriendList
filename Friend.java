
public class Friend {
    private String name; //이름
    private int group; //친구 그룹
    private String email; //이메일
    private String profilePic;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Friend(String name, int group, String phoneNumber, String email, String profilePic) {
        this.name = name;
        this.group = group;
        this.email = email;
        this.profilePic = profilePic;
        this.phoneNumber = phoneNumber;
    }

    public void print() {
        System.out.println(name + " : " + group + " : " + phoneNumber + " : " + email + " : " + profilePic);
    }
}
