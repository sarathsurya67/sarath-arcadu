package strings5;

import java.util.Date;

public class H
	{
		public static void main(String[] args)
			{
				Date d1 = new Date();
				long num = d1.getTime();
				Date d2 = new Date(num + 1000 * 60 * 60 * 24);
				System.out.println(d1);
				System.out.println(d2);
			}
	}
