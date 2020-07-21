/*
This Java Application is changing gallons to liters and display board.
*/
public class GalToLitTable {
//Java start running from here
public static void main(String args []){
	double gallons, liters;
	int counter; //Initialization of varables

	counter = 0; //Reseting counter

		for(gallons = 1 ; gallons <= 100 ; gallons++) {
			liters = gallons * 3.7854; //Changing from gallons to liters
			System.out.println(gallons + " gallons is " + liters + " liters.");

			counter++; //Inkrementation of counter every loop
			// Every 10 line making gap - free space
			if(counter == 10) { //If counter number is 10 make empty line
			System.out.println(); //Free space print here
			counter = 0; //Reset counter here
			}
		}
	}
}
