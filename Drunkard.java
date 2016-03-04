// Name:Yangping Zheng
// USC loginid:1512846791
// CS 455 PA1
// Fall 2015

/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

public class Drunkard {
    /**
       Creates drunkard with given starting location and distance
       to move in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
	private ImPoint startLoc;

	private int theStepSize;
	
	
	Random r = new Random();
	
    public Drunkard(ImPoint startLoc, int theStepSize) {
    	this.startLoc = startLoc;
    	this.theStepSize = theStepSize;
    }


    /**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
    	int i = 1+r.nextInt(4);   //generate a random number indicating the direction
    	switch(i){
    	case 1: startLoc = startLoc.translate(0-theStepSize,0); break; //step left
    	case 2: startLoc = startLoc.translate(theStepSize,0); break;   //step right
    	case 3: startLoc = startLoc.translate(0,theStepSize); break;   //step up
    	case 4: startLoc = startLoc.translate(0,0-theStepSize); break;  //step down
    	}
    		
    }
    
    public Point2D[] getPath(int stepsNum){
    	Point2D[] thePath = new Point2D[stepsNum];
    	for(int i=0;i<stepsNum;i++){
			thePath[i] = this.getCurrentLoc().getPoint2D();
			this.takeStep();
		}
    	return thePath;
    }


    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
    	return startLoc;
    }

}
