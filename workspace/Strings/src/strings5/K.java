package strings5;

import java.util.Calendar;
import java.util.Date;

public class K
	{
		public static void main(String[] args)
			{
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, 3);// 3 days adding to Calendar
				Date d1 = cal.getTime();
				System.out.println(d1);
			}
	}
