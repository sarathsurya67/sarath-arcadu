package strings5;

import java.util.Date;

public class C
	{
		public static void main(String[] args)
			{
				Date d1 = new Date();
				Date d2 = new Date(0);
				Date d3 = new Date(1000);// 1 sec after base date.
				System.out.println(d1);
				System.out.println(d2);
				System.out.println(d3);
			}
	}
