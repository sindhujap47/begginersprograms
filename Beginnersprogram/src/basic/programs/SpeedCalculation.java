package basic.programs;

public class SpeedCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distanceInKm=2;
		int distanceInMeter = 1000 * distanceInKm;
		int timeInHour = 2;
		int timeInMin = 30;
		int timeInSec = 20;
		double totaltimeInHours = timeInHour+(timeInMin/60.0)+(timeInSec/3600);
		double totaltimeInSeconds = (timeInHour*60.0*60.0)+(timeInMin*60.0)+(timeInSec);
		
		 double speed = distanceInKm/totaltimeInHours;
		System.out.println("Speed in Kilometers"+speed);
		double speed1 = distanceInMeter/totaltimeInSeconds;
		System.out.println("speed in meters:"+speed1);
		double distanceInMiles=distanceInMeter/1609;
		double speed2 =distanceInMiles/totaltimeInHours;
		System.out.println("Speed 2 :"+speed2);

	}

}
