/*
This Java Application shows difference between intiger and double variables.
*/
public class Example3 {
public static void main(String args []) {
	int a; 
	double b; //Initializing variables a - int, b - double
	
	a = 10; 
	b = 10.0; //Giving values to variables

	System.out.println(); //Adding empty space

	System.out.println("Initializing intiger a: " + a);
	System.out.println("Initializing double b: " + b);
	
	a = a / 2;
	b = b / 2; //Dividing values half

	System.out.println("intiger a divid half is equal: " + a);
	System.out.println("double b divid half is equal: " + b);

	a = 10 / 4;
	b = 10.0 / 4; //Changing to initial values and dividing 4

	System.out.println("intiger a divide 4 is equal: " + a);
	System.out.println("There is nothing behind decimal point in intiger");
	System.out.println("double b divide 4 is equal: " + b);
	System.out.println("There is value behind decimal point in double");


	}
}