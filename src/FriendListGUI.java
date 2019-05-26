package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendListGUI extends JFrame {
	
	FriendListFile fileGetter = new FriendListFile();
	FriendList friendList = new FriendList();
	
	public FriendListGUI() {
		
		super("친구 목록");
		setBounds(100,100,750,300);
		
		friendList = fileGetter.readFileToList("C:\\Users\\96jos\\eclipse-workspace\\project5\\friendlist-norm.data");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,1));
		JButton add = new JButton("Add");
		JButton delete = new JButton("Delete");
		JButton modify = new JButton("Modify");
		JButton saveFile = new JButton("Save File");
		p1.add(add);
		p1.add(delete);
		p1.add(modify);
		p1.add(saveFile);;
		AddButton addButton = new AddButton();
		add.addActionListener(addButton);
		DeleteButton deleteButton = new DeleteButton();
		delete.addActionListener(deleteButton);
		ModifyButton modifyButton = new ModifyButton();
		modify.addActionListener(modifyButton);
		SaveFileButton saveFileButton = new SaveFileButton();
		saveFile.addActionListener(saveFileButton);
		
		add(p1, BorderLayout.EAST);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,6));
		p2.add(new JLabel(""));
		p2.add(new JLabel("이름"));
		p2.add(new JLabel("그룹"));
		p2.add(new JLabel("전화번호"));
		p2.add(new JLabel("Email"));
		p2.add(new JLabel("사진"));
		for(int i=0;i<3;i++) {
			p2.add(new JCheckBox());
			p2.add(new JLabel(friendList.list[i].getName()));
			p2.add(new JTextField(friendList.list[i].getGroup()));
			p2.add(new JTextField(friendList.list[i].getNum()));
			p2.add(new JTextField(friendList.list[i].getEmail()));
			p2.add(new JLabel());
		}
		
		JPanel p3 = new JPanel();
		p3.add(p2, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class AddButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Add button Clicked.");
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
