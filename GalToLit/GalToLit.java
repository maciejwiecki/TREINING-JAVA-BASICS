/*
This Java Application is changing gallons to liters. 
*/
public class GalToLit {
//Java start running from here
public static void main(String args []){
	double gallons;
	double liters;

	gallons = 10; //How many gallons you want to change to liters? Value put here
	liters = gallons * 3.7854; // 3.7854 Liters = 1 Gallon

	System.out.println(gallons + " gallons is equal " + liters + " liters.");
	}
}
