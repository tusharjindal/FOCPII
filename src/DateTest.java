import java.util.*;
class Date{
	//int m;
	int m()
	{
		int m;
		m = 1;
		return m;
	}
	int day()
	{
	int day;
	day = 11;
	return day;
	}
	int year()
	{
	int year;
	year = 1999;
	return year;
	}
	public void displayDate(int m, int day, int year)
	{
	System.out.print(+m);
	System.out.print(" / ");
	System.out.print(+day);
	System.out.print(" / ");
	System.out.print(+year);
	}
}
class DateTest
{
	public static void main(String args[]){
	/*int m,day,year;*/
	Date DateObject = new Date();
	DateObject.displayDate(DateObject.m(), DateObject.day(), DateObject.year());
	}
}