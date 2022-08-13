import javax.swing.JFrame;

public class GameGame {

	public static int width;
	public static int height;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GameTest game = new GameTest();
		Player2 player2 = new Player2();
		frame.add(game);
		//frame.add(player2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.isResizable();
		width = frame.getHeight();
		height = frame.getHeight();
	}
}
