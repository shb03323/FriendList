
public class Friend {
   private String name;
   private String group;
   private String num;
   private String email;
   private String img;
   
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
   public String getNum() {
      return num;
   }
   public void setNum(String num) {
      this.num = num;
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

   public Friend(String name, String group, String num, String email, String img) {
      this.name = name;
      this.group = group;
      this.num = num;
      this.email = email;
      this.img =img;
   }
   
   public void print() {
      System.out.println("Name : " + name);
      System.out.println("Group : " + group);
      System.out.println("Phone Number : " + num);
      System.out.println("Email : " + email);
      System.out.println("Image : " + img);
   }
}
