package strings5;

import java.util.Calendar;
import java.util.Date;

public class P
	{
		public static void main(String[] args)
			{
				Calendar cal = Calendar.getInstance();
				Date d1 = cal.getTime();
				System.out.println(d1);
				cal.roll(Calendar.DATE, 30);// 1 month adding to
											// Calendar//rolling 30
											// days,reaching current month last
											// , it again start from the current
											// month starting.
				Date d2 = cal.getTime();
				System.out.println(d2);
			}
	}
