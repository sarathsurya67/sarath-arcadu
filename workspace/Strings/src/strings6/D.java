package strings6;

import java.util.Scanner;

public class D
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a string format");
				System.out.println("^[a-z]*@[a-z]+");
				String s1 = sc.next();
				String s2 = "^[a-z]*@[a-z]+";
				boolean b1 = Util.check(s1, s2);
				System.out.println(b1);
			}
	}
