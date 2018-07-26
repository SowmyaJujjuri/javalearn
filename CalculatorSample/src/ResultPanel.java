import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;

public class ResultPanel extends JPanel
{
	JTextField textField;
	
	ResultPanel()
	{
		textField = new JTextField();
		textField.setText("Answer");
		Font font = new Font("Serif", Font.BOLD, 66);
		textField.setFont(font);
				
		// add it to this panel
		super.add(textField);
	}
	public void setNumber(String number)
	{
		this.textField.setText(number);
	}
}