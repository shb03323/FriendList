package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFriend extends JFrame {
	public AddFriend() {
		super("�߰��� ģ�� ����");
		setBounds(100,400,700,150);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,5));
		p2.add(new JLabel("�̸�"));
		p2.add(new JLabel("�׷�"));
		p2.add(new JLabel("��ȭ��ȣ"));
		p2.add(new JLabel("Email"));
		p2.add(new JLabel("����"));
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
