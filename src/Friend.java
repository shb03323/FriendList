
public class Friend {
	private String name;
	private String group;
	private String tel;
	private String email;
	private String img;
	public boolean check = false;
	   
	public String getName() {
	   return name;
	}
	public void setName(String name) {
	   this.name = name;
	}
	public String getGroup() {
	   return group;
	}
	public void setGroup(String group) {
	   this.group = group;
	}
	public String getTel() {
	   return tel;
	}
	public void setNum(String tel) {
	   this.tel = tel;
	}
	public String getEmail() {
	   return email;
	}
	public void setEmail(String email) {
	   this.email = email;
	}
	public String getImg() {
	   return img;
	}
	public void setImg(String img) {
	   this.img = img;
	}
	
	public Friend(String name, String group, String tel, String email, String img) {
	      this.name = name;
	      this.group = group;
	      this.tel = tel;
	      this.email = email;
	      this.img =img;
	}
	   
	public void print() {
	   System.out.println("Name : " + name);
	   System.out.println("Group : " + group);
	   System.out.println("Phone Number : " + tel);
	   System.out.println("Email : " + email);
	   System.out.println("Image : " + img);
	}
}