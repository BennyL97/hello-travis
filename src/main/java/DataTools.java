
public class DataTools {
	static int dayOfTheWeek(int day, int month, int year){
		return (day + (2 * month))+(3*month + 3)/5 +year +year/4 -(year/100 - year/400 - 2) % 7;
		}
	
		static int daysPerYear(int year){
		if (year% 400 == 0) return 366;
	else if(year% 100 == 0) return 365;
	else if(year% 4 == 0) 	return 365;
	
	}
		static int daysPerMonth(int month, int year) {
		if (month == 1 || month == 3|| month == 5|| month == 7|| month == 8 || month == 10 || month == 12) return 31; 
		else if (month == 2 && year == 366 ) return 29;
		else if (month == 2) return 28 ;
		else if (month == 4 || month == 6 || month == 9 || month == 11) return 30 ; 

	}
		static int dayOfTheYear(int day, int month, int year) {
		int countdays = 0;
		int countmonth = 1; 
		while (countmonth != month) {
			countdays += daysPerMonth ( countmonth,year );
			countmonth +=1 ;
			
		}
}
}