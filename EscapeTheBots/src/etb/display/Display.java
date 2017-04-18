package etb.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Display {

	private JFrame frame;
	private Canvas canvas;
	
	
	private int width, height;
	private static final String TITLE = "Escape the Bots!";
	
	public Display(String title, int width, int height)
	{
		
		this.width = width;
		this.height = height;
		
		createDisplay();
		
		
	}
	


	private void createDisplay()
	{
		frame = new JFrame(TITLE);
		frame.setSize(width,  height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
		
		
		
	}



	public Canvas getCanvas(){
		return canvas;
	}

	
}
