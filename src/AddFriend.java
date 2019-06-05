
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class AddFriend extends JFrame {
	
	public String nameText1;
	public String groupText1;
	public String telText1;
	public String emailText1;
	public String imgText1;
	JTextField nameText = new JTextField();
	JTextField groupText = new JTextField();
	JTextField telText = new JTextField();
	JTextField emailText = new JTextField();
	JTextField imgText = new JTextField();
//	FriendListGUI friendListGUI = new FriendListGUI();
	
	class MenuPanel extends JPanel {
		public MenuPanel() {
			setLayout(new GridLayout(2,5));
			add(new JLabel("이름"));
			add(new JLabel("그룹"));
			add(new JLabel("전화번호"));
			add(new JLabel("Email"));
			add(new JLabel("사진"));
			
			//JTextField nameText = new JTextField();
			add(nameText);
			//JTextField groupText = new JTextField();
			add(groupText);
			//JTextField telText = new JTextField();
			add(telText);
			//JTextField emailText = new JTextField();
			add(emailText);
			//JTextField imgText = new JTextField();
			add(imgText);
			
			nameText1 = nameText.getText();
			groupText1 = groupText.getText();
			telText1 = telText.getText();
			emailText1 = emailText.getText();
			imgText1 = imgText.getText();
			
		}
	}
	
	public AddFriend(FriendListFile fileGetter) {
		super("추가될 친구 정보");
		setBounds(100,400,700,150);
		
		MenuPanel menuPanel = new MenuPanel();
		
		add(menuPanel, BorderLayout.CENTER);
		
		JButton done = new JButton("Done");
//		DoneButton doneButton = new DoneButton();
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText1 = nameText.getText();
				groupText1 = groupText.getText();
				telText1 = telText.getText();
				emailText1 = emailText.getText();
				imgText1 = imgText.getText();
				
				fileGetter.friendList.addFriend(new Friend(nameText1, groupText1, telText1, emailText1, imgText1));
				System.out.println(nameText1);
				dispose();
			}
		});
		
		add(done, BorderLayout.EAST);
		setVisible(true);
	}
}

//class DoneButton implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Done button Clicked.");
//	}
//}
