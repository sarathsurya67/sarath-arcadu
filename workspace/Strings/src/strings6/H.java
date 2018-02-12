package strings6;

import java.util.Scanner;

public class H
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter a string format");
				System.out
						.println("^[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*\\.[a-zA-Z_]{2,}$");
				String s1 = sc.next();
				String s2 = "^[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*\\.[a-zA-Z_]{2,}$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
