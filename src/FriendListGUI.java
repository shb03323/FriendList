
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class FriendListGUI extends JFrame {

	FriendListFile fileGetter = new FriendListFile();
	JPanel p = new JPanel();
	ArrayList<JTextField> nameField = new ArrayList<JTextField>();
	ArrayList<JTextField> groupField = new ArrayList<JTextField>();
	ArrayList<JTextField> telField = new ArrayList<JTextField>();
	ArrayList<JTextField> emailField = new ArrayList<JTextField>();
	ArrayList<JTextField> imgField = new ArrayList<JTextField>();
	
	class MenuPanel extends JPanel {
		public MenuPanel() {
			setLayout(new GridLayout(4,1));
			JButton add = new JButton("Add");
			JButton delete = new JButton("Delete");
			JButton modify = new JButton("Modify");
			JButton saveFile = new JButton("Save File");
			add(add);
			add(delete);
			add(modify);
			add(saveFile);
			
			AddButton addButton = new AddButton();
			add.addActionListener(addButton);
			DeleteButton deleteButton = new DeleteButton();
			delete.addActionListener(deleteButton);
			ModifyButton modifyButton = new ModifyButton();
			modify.addActionListener(modifyButton);
			SaveFileButton saveFileButton = new SaveFileButton();
			saveFile.addActionListener(saveFileButton);
		}
	}
	
	class InfoPanel extends JPanel {
		public InfoPanel() {
			setLayout(new GridLayout(fileGetter.friendList.numFriends()+1,6));
			
			add(new JLabel());
			add(new JLabel("이름"));
			add(new JLabel("그룹"));
			add(new JLabel("전화번호"));
			add(new JLabel("Email"));
			add(new JLabel("사진"));
			for(int i=0;i<fileGetter.friendList.numFriends();i++) {
				JCheckBox checkBox = new JCheckBox();
				String name = fileGetter.friendList.getFriend(i).getName();
				String group = fileGetter.friendList.getFriend(i).getGroup();
				String tel = fileGetter.friendList.getFriend(i).getTel();
				String email = fileGetter.friendList.getFriend(i).getEmail();
				String img = fileGetter.friendList.getFriend(i).getImg();
				
				JTextField nameText = new JTextField(name);
				JTextField groupText = new JTextField(group);
				JTextField telText = new JTextField(tel);
				JTextField emailText = new JTextField(email);
				JTextField imgText = new JTextField(img);
				nameField.add(nameText);
				groupField.add(groupText);
				telField.add(telText);
				emailField.add(emailText);
				imgField.add(imgText);
			}
		}
	}
	
	public void update() {

		InfoPanel infoPanel = new InfoPanel();
		infoPanel.removeAll();
		
		infoPanel.setLayout(new GridLayout(fileGetter.friendList.numFriends()+1,6));
		infoPanel.add(new JLabel());
		infoPanel.add(new JLabel("이름"));
		infoPanel.add(new JLabel("그룹"));
		infoPanel.add(new JLabel("전화번호"));
		infoPanel.add(new JLabel("Email"));
		infoPanel.add(new JLabel("사진"));
		for(int i=0;i<fileGetter.friendList.numFriends();i++) {
			JCheckBox checkBox = new JCheckBox();
			String name = fileGetter.friendList.getFriend(i).getName();
			String group = fileGetter.friendList.getFriend(i).getGroup();
			String tel = fileGetter.friendList.getFriend(i).getTel();
			String email = fileGetter.friendList.getFriend(i).getEmail();
			String img = fileGetter.friendList.getFriend(i).getImg();
			
			JTextField nameText = new JTextField(name);
			JTextField groupText = new JTextField(group);
			JTextField telText = new JTextField(tel);
			JTextField emailText = new JTextField(email);
			JTextField imgText = new JTextField(img);
			nameField.set(i, nameText);
			groupField.set(i, groupText);
			telField.set(i, telText);
			emailField.set(i, emailText);
			imgField.set(i, imgText);
			
			infoPanel.add(checkBox);
			infoPanel.add(nameText);
			infoPanel.add(groupText);
			infoPanel.add(telText);
			infoPanel.add(emailText);
			infoPanel.add(imgText);
			
			Friend temp = fileGetter.friendList.getFriend(i);
			checkBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==ItemEvent.SELECTED) {
						temp.check = true;
					}
					
					else {
						temp.check = false;
					}
				}
			}); 
		}
		
		p.removeAll();
		p.add(infoPanel,BorderLayout.NORTH);
		
		infoPanel.revalidate();
		infoPanel.repaint();
		
		infoPanel.setVisible(true);
	}
	
	public void frameUpdate() {
		dispose();
		
		MenuPanel menuPanel = new MenuPanel();
		
		add(menuPanel, BorderLayout.EAST);
		add(p,BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public FriendListGUI() {
		super("친구 목록");
		setBounds(100,100,900,300);
		
		fileGetter.friendList = fileGetter.readFileToList("friendlist-norm.data");
		
		update();
		frameUpdate();
		
		setVisible(true);
	}
	
	class AddButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			AddFriend addFriend = new AddFriend(fileGetter,FriendListGUI.this);
		}
	}
	
	class DeleteButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			DeleteFriend deleteFriend = new DeleteFriend(fileGetter, FriendListGUI.this);
		}
	}
	
	class ModifyButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModifyFriend modifyFriend = new ModifyFriend(fileGetter, FriendListGUI.this);
		}
	}
	
	class SaveFileButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				fileGetter.readListToFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
