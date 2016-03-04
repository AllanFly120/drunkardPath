// Name:Yangping Zheng
// USC loginid:1512846791
// CS 455 PA1
// Fall 2015
/*
 * The main method. Input the steps number which cannot smaller than 0 or be double.
 * Then draw the component on the window.
 * */

import javax.swing.JFrame;
import java.util.*;
public class RandomWalkViewer {

	public static void main(String[] args) {
/*
 * Initialize the frame
 * */
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Random Walk Route");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int stepsNum=0;
/*
 * Scan in and error-checking
 * If input<0, output:ERROR: Number entered must be greater than 0. Until there is a positive input.
 * If input is Double, output: ERROR: Number entered must be an integer. Please run me again. Then end the program.
 * */
		
		Scanner in = new Scanner(System.in);
		try{
			System.out.print("Enter number of steps:");
			stepsNum = in.nextInt();
			
			while(stepsNum <= 0){
				System.out.println("ERROR: Number entered must be greater than 0.");
				System.out.print("Enter number of steps:");
				
				stepsNum = in.nextInt();		
				
			}
		}catch(InputMismatchException e){
			System.out.println("ERROR: Number entered must be an integer. Please run me again");
			System.exit(1);
		}
		
/*
 * Put the path of a drunkard(a component) on the frame.
 * */
		ImPoint startLoc = new ImPoint(200,200);
		Drunkard drunk = new Drunkard(startLoc,5);
		RandomWalkComponent component = new RandomWalkComponent(drunk.getPath(stepsNum)); 
		frame.add(component);
		frame.setVisible(true);
	}
}



