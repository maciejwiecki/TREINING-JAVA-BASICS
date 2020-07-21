public class Moon {
	public static void main(String[] args) {
	double massOnMoon;	
	double gravityOnMoon;
	double gravityOnEarth;
	double massOnEarth;

	massOnEarth = 72;
	gravityOnEarth = 1;
	gravityOnMoon = gravityOnEarth - 0.83;
	massOnMoon = massOnEarth * gravityOnMoon;

	System.out.println("Your mass on Earth is: " + massOnEarth + " kgs.");
	System.out.println("Gravity on Earth is 9,807 m/s².");
	System.out.println("Gravity on Moon is 1,62 m/s². Which is about 17% of gravity on Earth.");
	System.out.println("Your mass on Moon is: " + massOnMoon + " kgs.");
	}
}