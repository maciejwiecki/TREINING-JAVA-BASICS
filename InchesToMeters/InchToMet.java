/*
This Java Application is changing inches to meters.
*/
public class InchToMet {
//Java start running from here
public static void main(String args []){
	double inches, meters, centimeters;
	int counter; //Initialization of varables

	counter = 0; //Reseting counter

		for(inches = 1 ; inches <= 144 ; inches++) {
			meters = inches * 0.0254; //Changing from inches to centimeters

			System.out.println(inches + " inches is " + meters + " meters.");

			counter++; //Incrementation of counter every loop
			// Every 12 line making gap - free space
			if(counter == 12) { //If counter number is 12 make empty line
			System.out.println(); //Free space print here
			counter = 0; //Reset counter here
			}
		}
	}
}
