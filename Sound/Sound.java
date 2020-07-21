/*
This JAVA Aplication is calculating discance from thunder, when we know time elapsed.
*/

public class Sound {
	public static void main(String [] args) {
		double soundSpeed;
		double timeElapsed;
		double distance;	
		
		soundSpeed = 330;
		timeElapsed = 7.2;
		
		distance = soundSpeed * timeElapsed;
		
		System.out.println("Sound speed is about 330m per second.");
		System.out.println("Time elapsed from thunder is 7.2 secounds.");
		System.out.println("Distance from thunder was: " + distance + " meters.");
	}
}