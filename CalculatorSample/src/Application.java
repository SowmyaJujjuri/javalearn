import javax.swing.*;
import java.awt.*;

public class Application 
{

	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(2,2);
		f.setLayout(layout);
	
		ResultPanel resultPanel = new ResultPanel();
		f.add(resultPanel);
	
		JPanel dummyPanel = new JPanel();
		f.add(dummyPanel);
		
		NumberPanel p = new NumberPanel(resultPanel);
		p.setBackground(Color.BLACK);
		f.add(p);
		
		OperationalPanel opPanel = new OperationalPanel();
		f.add(opPanel);
		
		f.setVisible(true);
	}
}