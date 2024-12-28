import java.util.Scanner;
class CurrentTime{
	public static void main(String[] args){

		long currentTimeMillis = System.currentTimeMillis(); 
		long totalSeconds = currentTimeMillis / 1000;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours % 12)-4;
		long currentSeconds = totalSeconds % 60;
	


		System.out.print(currentHour + ":" + currentMinute + ":" + currentSeconds);
	}	
}
