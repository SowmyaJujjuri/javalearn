import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener 
{
	ResultPanel resultPanel;
	NumberPanel(ResultPanel resultPanel)
	{
		this.resultPanel = resultPanel;
		
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		setLayout(numberPanelLayout);
			
		for(int i = 0; i < 10; i++)
		{
			String buttonText = Integer.toString(i);
			JButton b = new JButton();
			b.setText(buttonText);
			Font font = new Font("Serif", Font.BOLD, 66);
			b.setFont(font);
			b.addActionListener(this);
			add(b);
		}
	}
	public void actionPerformed(ActionEvent e) 
	{
		// Button will call this method if user clicks button.
		String buttonText = e.getActionCommand();
		this.resultPanel.setNumber(buttonText);
	}
		
}
