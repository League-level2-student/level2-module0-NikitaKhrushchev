package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	Robot[] r = new Robot[5];
	static Random w = new Random();
	public static void main(String[] args) throws InterruptedException {
	for (int i = 0; i < r.length; i++) {
		r[i] = new Robot();
		r[i].setX(i*150+100);
		r[i].setY(500);
		r[i].setSpeed(200);
	}	
	boolean won = false;
	String c = new String();
	while(!won) {
		for (int i = 0; i < r.length; i++) {
			r[i].move(w.nextInt(500));
		if(r[i].getY()<1) {
			won = true;
			c = Integer.toString(i);
		}
	}
	if (won) {
		String sd = ("Robot " +c + " wins"); 
		System.out.println(sd);
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
	}
