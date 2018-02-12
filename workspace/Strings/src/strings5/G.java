package strings5;

import java.util.Date;

public class G
	{
		public static void main(String[] args)
			{
				Date d1 = new Date();
				System.out.println(d1);
				System.out.println(d1.getTime());
				Date d2 = new Date(d1.getTime());// getting milloseconds from
													// basedate to till now
				System.out.println(d2);// same assining here So both are same
										// dates.
			}
	}
