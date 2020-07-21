/*
This JAVA Aplication is calculating distance to mountain by echo sound.
*/

public class Sound2 {
	public static void main(String [] args) {
		double soundSpeed;
		double timeElapsed;
		double distance;	
		
		soundSpeed = 330;
		timeElapsed = 7.2;
		
		distance = soundSpeed * timeElapsed;
		
		System.out.println("Sound speed is about 330m per second.");
		System.out.println("Time elapsed from handclap is 7.2 secounds.");
		System.out.println("Distance to mount is: " + (distance /2) + " meters.");
	}
}