
import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class FriendListGUI extends JFrame {
	
	FriendListFile fileGetter = new FriendListFile();
	
	//what to do
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
	
	//friend info list
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
				add(new JCheckBox());
				add(new JLabel(fileGetter.friendList.getFriend(i).getName()));
				add(new JTextField(fileGetter.friendList.getFriend(i).getGroup()));
				add(new JTextField(fileGetter.friendList.getFriend(i).getTel()));
				add(new JTextField(fileGetter.friendList.getFriend(i).getEmail()));
				add(new JTextField(fileGetter.friendList.getFriend(i).getImg()));
			}
		}
	}
	
	public FriendListGUI() {
		
		//UI
		super("친구 목록");
		setBounds(100,100,750,300);
		
		fileGetter.friendList = fileGetter.readFileToList("friendlist-norm.data");
		
		MenuPanel menuPanel = new MenuPanel();
		InfoPanel infoPanel = new InfoPanel();
		
		JPanel p = new JPanel();
		
		add(menuPanel, BorderLayout.EAST);
		add(p, BorderLayout.CENTER);
		p.add(infoPanel, BorderLayout.NORTH);
		
		setVisible(true);
	}
}

class AddButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		FriendListFile fileGetter = new FriendListFile();
		
		AddFriend addFriend = new AddFriend(fileGetter);
	}
}

class DeleteButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Delete button Clicked.");
	}
}

class ModifyButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Modify button Clicked.");
	}
}

class SaveFileButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Save File button Clicked.");
	}
}
