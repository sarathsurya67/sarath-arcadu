package strings6;

import java.util.Scanner;

public class P
	{
		private static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				System.out.println("enter any year number(yyyy)");
				System.out.println("in 20th or 21th century");
				String s1 = sc.next();
				String s2 = "^(190[1-9]{1}||19[1-9]{1}[0-9]{1}||2100)$";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
