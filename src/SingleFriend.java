import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SingleFriend extends JPanel{
	boolean check;
	public SingleFriend(String name, String group, String tel, String email, String img) {
		setPreferredSize(new Dimension(650,30));
		JCheckBox checkBox = new JCheckBox("", false);
		JLabel nameField = new JLabel(name);
		add(nameField);
		add(new JLabel(name));
		add(new JTextField(group));
		add(new JTextField(tel));
		add(new JTextField(email));
		add(new JTextField(img));
		
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					check = true;
				}
			}
		}); 
	}
}
