package strings6;

import java.util.Scanner;

public class B
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a string format");
				System.out.println("^[a-z]{1,3}@[a-z]{1,3}");
				String s1 = sc.next();
				String s2 = "^[a-z]{1,3}@[a-z]{1,3}";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
