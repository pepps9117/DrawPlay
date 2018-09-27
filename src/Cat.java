import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 50;
	private static final int EYE_WIDTH = 50;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.gray);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw body
		g2.setColor(Color.gray);
		g2.fillOval(200,150,300,100);
		g2.fillOval(200,200,50,100);
		g2.fillOval(400,200,50,100);
		
		// Draw the eyes
		g2.setColor(Color.yellow);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
//		g2.setColor(Color.green);
//		x = catX + MOUTH_X;
//		y = catY + MOUTH_Y;
//		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		//Draw nose
		g2.setColor(Color.pink);
		int X[] = {160, 150, 170};
		int Y[] = {150, 155, 155};
		g2.fillPolygon(X, Y, 3);
		
		
		g2.setColor(Color.gray);
		int X1[] = {100,70,130};
		int Y1[] = {40,90,90};
		g2.fillPolygon(X1,Y1,3);

		int X2[] = {200,170,230};
		int Y2[] = {40,90,90};
		g2.fillPolygon(X2,Y2,3);
		
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.setColor(Color.black);
		g2.drawString("OwO What's this?", catX, catY+HEAD_DIMENSION+10);
		x = catX + MOUTH_X + 25;
		y = catY + MOUTH_Y + 25;
		g2.drawString("W", x, y);
	}
}
