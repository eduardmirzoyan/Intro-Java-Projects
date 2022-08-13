import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.awt.*;
import javax.swing.*;

public class GameTest extends JPanel implements ActionListener, KeyListener {

	private int x = 0;
	private int y = 0;
	private int vx = 0;
	private int vy = 0;
	Timer t = new Timer(5, this);
	
	public GameTest() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(x, y, 40, 40);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(x < 0) {
			vx = 0;
			x = 0;
		}
		if(x > GameGame.width) {
			vx = 0;
			x = GameGame.width;
		}
		if(y < 0) {
			vy = 0;
			y = 0;
		}
		if(y > GameGame.height) {
			vy = 0;
			y = GameGame.height;
		}
		x += vx;
		y += vy;
		repaint();
	}
	
	public void up() {
		vy = -1;
		vx = 0;
	}
	
	public void down() {
		vy = 1;
		vx = 0;
	}
	
	public void left() {
		vy = 0;
		vx = -1;
	}
	
	public void right() {
		vy = 0;
		vx = 1;
	}
	
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP) {
			up();
		}
		if(code == KeyEvent.VK_DOWN) {
			down();
		}
		if(code == KeyEvent.VK_LEFT) {
			left();
		}
		if(code == KeyEvent.VK_RIGHT) {
			right();
		}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_LEFT) {
            vx = 0;
        }

        if (code == KeyEvent.VK_RIGHT) {
            vx = 0;
        }

        if (code == KeyEvent.VK_UP) {
            vy = 0;
        }

        if (code == KeyEvent.VK_DOWN) {
            vy = 0;
        }
        else {}

//		vx = 0;
//		vy = 0;
	}
}