package strings6;

import java.util.Scanner;

public class I
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter a string format");
				System.out.println("^0[0-9]{2}-{0-9}{8}$");
				String s1 = sc.next();
				String s2 = "^0[0-9]{2}-{0-9}{8}$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
