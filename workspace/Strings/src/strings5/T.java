package strings5;

import java.text.DateFormat;
import java.util.Date;

public class T
	{
		public static void main(String[] args)
			{
				Date d1 = new Date();
				DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);// by
																				// def
																				// also
																				// medium
				String s1 = df.format(d1);
				System.out.println(s1);// 7/3/16

			}
	}
