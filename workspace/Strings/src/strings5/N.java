package strings5;

import java.util.Calendar;
import java.util.Date;

public class N
	{
		public static void main(String[] args)
			{
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, -2);// 2 years back adding to Calendar
				Date d1 = cal.getTime();
				System.out.println(d1);
			}
	}
