import javax.swing.*;

public class Application 
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
			f.setSize(1000, 1000);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			JPanel p = new JPanel();
			p.setBackground(Color.BLUE);
			f.add(p);
			
			
			JButton b = new JButton();
			b.setText("1");
			p.add(b);
			
			f.setVisible(true);
	}
}
