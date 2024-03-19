package ch1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameJava1_08_JFrame extends JFrame {
	private static final long serialVersionUID = -2806750967539824371L;

	public static void main(String[] args) {
		GameJava1_08_JFrame frame = new GameJava1_08_JFrame();
		frame.setVisible(true);
	}

	public GameJava1_08_JFrame() {
		setBounds(100, 100, 400, 300);
		JPanel panel = new JPanel();

		JLabel label = new JLabel("처음 만들어 본 자바 애플릿");
		panel.add(label);

		setContentPane(panel);
	}

}
