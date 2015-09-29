import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame{
	private static final long serialVersionUID = 1L;

	public Fenetre(){
		super("Fenetre");
		configFrame();
		setVisible(true);
		//pack();
	}
	
	public void configFrame(){
		setLayout(new GridBagLayout());
		setLocation(800, 100);
		setSize(1000, 500);
		setResizable(true);
		JPanel pane = new JPanel();
		this.add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}