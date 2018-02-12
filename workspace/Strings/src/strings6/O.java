package strings6;

import java.util.Scanner;

public class O
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter any month number(dd)");
				System.out.println("in a year");
				String s1 = sc.next();
				String s2 = "^([0][1-9]||[1][012])$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
