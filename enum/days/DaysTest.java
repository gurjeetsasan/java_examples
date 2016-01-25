public class DaysTest{
	public static void main( String args[] ){
		Days d = Days.Wednesday;
		System.out.println("WeekDays: "+ d);
		
		for( Days dy: Days.values()){
			System.out.println("Day is: "+ dy);
		}
	}
}
