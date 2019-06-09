import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SingleFriend extends JPanel{
	boolean check;
	public SingleFriend(String name, String group, String tel, String email, String img) {
		setPreferredSize(new Dimension(700,30));
		JCheckBox checkBox = new JCheckBox("", false);
		add(new JTextField(name));
		add(new JTextField(group));
		add(new JTextField(tel));
		add(new JTextField(email));
		add(new JTextField(img));
		
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					check = true;
				}
				
				else {
					check = false;
				}
			}
		}); 
	}
}
