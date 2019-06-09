
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
	JButton done = new JButton("Done");
	FriendListGUI input = null;
	
	class MenuPanel extends JPanel {
		public MenuPanel() {
			setLayout(new GridLayout(2,5));
			add(new JLabel("이름"));
			add(new JLabel("그룹"));
			add(new JLabel("전화번호"));
			add(new JLabel("Email"));
			add(new JLabel("사진"));
			
			add(nameText);
			add(groupText);
			add(telText);
			add(emailText);
			add(imgText);
			
			nameText1 = nameText.getText();
			groupText1 = groupText.getText();
			telText1 = telText.getText();
			emailText1 = emailText.getText();
			imgText1 = imgText.getText();
			
		}
	}

	public AddFriend(FriendListFile fileGetter,FriendListGUI input) {
		super("추가될 친구 정보");
		this.input = input;
		setBounds(100,400,700,150);
		
		MenuPanel menuPanel = new MenuPanel();
		
		add(menuPanel, BorderLayout.CENTER);
		
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText1 = nameText.getText();
				groupText1 = groupText.getText();
				telText1 = telText.getText();
				emailText1 = emailText.getText();
				imgText1 = imgText.getText();
				
				fileGetter.friendList.addFriend(new Friend(nameText1, groupText1, telText1, emailText1, imgText1));
				fileGetter.friendList.list.get(3).print();
				
				//FriendListGUI friendGUI = new FriendListGUI();
				input.update();
				dispose();
			}
		});
		
		add(done, BorderLayout.EAST);
		setVisible(true);
	}
}
