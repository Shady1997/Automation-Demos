package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener,ActionListener{
	private int [] snakeXLength= new int[750];
	private int [] snakeYLength= new int[750];
	
	private boolean left=false;
	private boolean right=false;
	private boolean up=false;
	private boolean down=false;
	
	private ImageIcon leftSnakeMouse;
	private ImageIcon rightSnakeMouse;
	private ImageIcon topSnakeMouse;
	private ImageIcon downSnakeMouse;
	
	private Timer timer;
	private int delay=100;
	
	private int lengthOfSanke=3;
	
	private int moves= 0;
	
	private ImageIcon snakeImage;
	
	private ImageIcon titleImage;
	
	public GamePlay() {
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer=new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		if(moves==0)
		{
			snakeXLength[0]=100;
			snakeXLength[1]=75;
			snakeXLength[2]=50;
			
			snakeYLength[0]=100;
			snakeYLength[1]=100;
			snakeYLength[2]=100;
		}
		
		//draw title img border
		g.setColor(Color.white);
		g.drawRect(24, 10, 851, 55);
		
		//draw title image
		titleImage=new ImageIcon("title.png");
		titleImage.paintIcon(this, g, 25, 11);
		
		//draw border for game play
		g.setColor(Color.white);
		g.drawRect(24, 74, 851, 575);
		
		//draw background for game play
		g.setColor(Color.black);
		g.fillRect(25, 75, 850, 575);
		
		rightSnakeMouse = new ImageIcon("snake.jpg");
		rightSnakeMouse.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);
		
		for(int a=0;a<lengthOfSanke;a++)
		{
			if(a==0 && right)
			{
				rightSnakeMouse = new ImageIcon("snake.jpg");
				rightSnakeMouse.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
			}
			
			if(a==0 && left)
			{
				leftSnakeMouse = new ImageIcon("snake.jpg");
				leftSnakeMouse.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
			}
			
			if(a==0 && up)
			{
				topSnakeMouse = new ImageIcon("snake.jpg");
				topSnakeMouse.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
			}
			
			if(a==0 && down)
			{
				downSnakeMouse = new ImageIcon("snake.jpg");
				downSnakeMouse.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
			}
			
			if(a!=0)
			{
				snakeImage = new ImageIcon("snake.jpg");
				snakeImage.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
			}
		}
		
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}










