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

public class Player2 extends JPanel implements ActionListener, KeyListener {

	private int x = 70;
	private int y = 70;
	private int vx = 0;
	private int vy = 0;
	Timer t1 = new Timer(5, this);
	
	public Player2() {
		t1.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(x, y, 50, 50);
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
		if(code == KeyEvent.VK_W) {
			up();
		}
		if(code == KeyEvent.VK_S) {
			down();
		}
		if(code == KeyEvent.VK_A) {
			left();
		}
		if(code == KeyEvent.VK_D) {
			right();
		}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		vx = 0;
		vy = 0;
	}
}
