package main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MenuDisplay extends JFrame implements ActionListener {

	public static final int SCREEN_WIDTH = 800; 
	public static final int SCREEN_HEIGHT = 600;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;

	
	private static final long serialVersionUID = 1L;
	public MenuDisplay() {
		this.setTitle("ARKANOID - Menu Principal");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(false);
		this.setResizable(false);
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.getContentPane().setBackground(Color.BLACK);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
	       boton1=new JButton("NUEVA PARTIDA");
	        boton1.setBounds(10,100,90,30);
	        this.add(boton1);
	        boton1.addActionListener(this);
	        boton2=new JButton("OPCIONES");
	        boton2.setBounds(110,100,90,30);
	        this.add(boton2);
	        boton2.addActionListener(this);
	        boton3=new JButton("SALIR");
	        boton3.setBounds(210,100,90,30);
	        this.add(boton3);
	        boton3.addActionListener(this);   
        //this.addKeyListener((KeyListener) boton1);
	//	this.createBufferStrategy(2);


//		this.add(test);
//		this.getContentPane().add(panel);
/*		
		BufferStrategy bf = this.getBufferStrategy();
		Graphics g = null;

		try {

			g = bf.getDrawGraphics();

			g.setColor(Color.black);
			g.fillRect(0, 0, getWidth(), getHeight());
			scoreboard.draw(g);
			g.drawRect (120, 100, 550, 100);  
			g.drawRect (120, 250, 550, 100);
			g.drawRect (120, 400, 550, 100);  

		} finally {
			g.dispose();
		}

		bf.show();
*/

	}
	/*
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
*/
	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {

        	new Arkanoid().run();
        }
        if (e.getSource()==boton2) {
            setTitle("OPCIONES");
        }
        if (e.getSource()==boton3) {
            setTitle("SALIR");
        }        
		
	}
}
