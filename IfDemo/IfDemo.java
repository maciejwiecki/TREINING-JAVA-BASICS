/*
This Java Application shows how to use conditional statement if.
*/
public class IfDemo {
public static void main(String args[]) {
	int a,b,c;
	
	a = 6;
	b = 3;

	System.out.println("a is equal: " + a);
	System.out.println("b is equal: " + b);

	if(a < b) System.out.println("a is smaller then b");
	if(a > b) System.out.println("a is bigger then b");
	if(a == b) System.out.println("a is equal b");

	// Conditional statement bellow will not be shown
	if (a == b) System.out.println("a is equal b");

	System.out.println();

	c = a - b;

	if (c < 0) System.out.println("c is smaller then 0");
	if (c > 0) System.out.println("c is bigger then 0");
	if (c == 0) System.out.println("c is equal zero");

	if (c >= 0) System.out.println("c is bigger then zero and it is equal: " + c);
	if (c =< 0) System.out.println("c is lower then zero and it is equal: " + c);
	if (c == 0) System.out.println("c is neutral and it is equal zero");
	}


}