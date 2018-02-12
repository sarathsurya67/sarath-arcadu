package strings6;

import java.util.Scanner;

public class Q
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter a date in");
				System.out.println("the dd mm yyyy");
				String s1 = sc.next();
				String s2 = " ^(([0][1-9][\\s]) || ([12][0-9][\\s] || ([3][01][\\s])) (([0][1-9][\\s]) || ([1][012][\\s])) (19[0-9]{2} || 20[0-9]{2} || 2100)$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
