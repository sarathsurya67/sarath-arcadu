package strings6;

import java.util.Scanner;

public class N
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter any day number(dd)");
				System.out.println("in a month");
				String s1 = sc.next();
				String s2 = "^([0][1-9]||[12][0-9]||[3][01])$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
