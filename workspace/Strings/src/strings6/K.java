package strings6;

import java.util.Scanner;

public class K
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter a string format");
				System.out.println("^0[0-9]{10}$");
				String s1 = sc.next();
				String s2 = "^0[0-9]{10}$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
