package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFriend extends JFrame {
	public AddFriend() {
		super("추가될 친구 정보");
		setBounds(100,400,700,150);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,5));
		p2.add(new JLabel("이름"));
		p2.add(new JLabel("그룹"));
		p2.add(new JLabel("전화번호"));
		p2.add(new JLabel("Email"));
		p2.add(new JLabel("사진"));
		for(int i=0;i<5;i++) {
			p2.add(new JTextField());
		}
		add(p2, BorderLayout.CENTER);
		
		JButton done = new JButton("Done");
		DoneButton doneButton = new DoneButton();
		done.addActionListener(doneButton);
		add(done, BorderLayout.EAST);
		setVisible(true);
	}
}

class DoneButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Done button Clicked.");
	}
}
