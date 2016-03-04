// Name:Yangping Zheng
// USC loginid:1512846791
// CS 455 PA1
// Fall 2015
/*
 * in the component we new a drunkard and make it taking steps.
 * and draw a line step by step. When the drunkard finishes all 
 * his steps, we get the path.
 * */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
public class RandomWalkComponent extends JComponent {
//	int stepsNum;           //for the communication with RandomWalkViewer
	Point2D[] thePath;
	public RandomWalkComponent(Point2D[] thePath){
		this.thePath = thePath;
	}
	public void paintComponent(Graphics g){

		
//		ImPoint startLoc = new ImPoint(200,200);
//		Drunkard drunk = new Drunkard(startLoc,5);
		
		Graphics2D g2 = (Graphics2D)g;

		

		for(int i=0;i<thePath.length-1;i++){
			Point2D fromLoc = thePath[i];
			Point2D toLoc = thePath[i+1];
			Line2D.Double line = new Line2D.Double(fromLoc,toLoc);
			g2.draw(line);
		}				
	}
	
	
}
