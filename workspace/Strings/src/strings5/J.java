package strings5;

import java.util.Calendar;
import java.util.Date;

public class J
	{
		public static void main(String[] args)
			{
				Calendar cal = Calendar.getInstance();// calender is an abstract
														// cls we cannot create
														// an obj straight
														// away...instead call
														// getInstance method.
				Date d1 = cal.getTime();
				System.out.println(d1);
			}
	}
