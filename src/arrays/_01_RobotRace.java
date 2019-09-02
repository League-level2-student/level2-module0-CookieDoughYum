package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot r[]=new Robot[7];
	for(int i=0; i<7; i++) {
		r[i]=new Robot();
		r[i].setY(500);
	}
	r[0].setX(10);
	r[1].setX(110);
	r[2].setX(210);
	r[3].setX(310);
	r[4].setX(410);
	r[5].setX(510);
	r[6].setX(610);
	boolean finished=false;
	while(!finished) {
	for(int i=0; i<7; i++) {
		r[i].setSpeed(100);
		Random r1=new Random();
		r[i].move(r1.nextInt(50));
		if(r[i].getY()<20) {
			finished=true;
			JOptionPane.showMessageDialog(null, " Congratulations Robot "  + i + " , You won! ");
			
		}
	}
	}
}
	//2. create an array of 5 robots.
	//3. use a for loop to initialize the robots.
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
