package ch1;
 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class GameJava1_08_JFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;  
	
	public static void main(String[] args) {
		GameJava1_08_JFrame frame = new GameJava1_08_JFrame();
		frame.setVisible(true);		 
	}
 
	public GameJava1_08_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel(); 
		
		JLabel label = new JLabel("처음 만들어 본 자바 애플릿");
		label.setHorizontalAlignment(JLabel.CENTER); 
		contentPane.add(label);

		setContentPane(contentPane); 
		
	}

}
