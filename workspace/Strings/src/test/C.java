package test;

import java.util.Scanner;

public class C
	{
		static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				String s;
				String reverse = "";
				System.out.println("pls enter a string");
				s = sc.nextLine();
				for (int i = s.length() - 1; i >= 0; i--)
					{
						reverse = reverse + s.charAt(i);
					}
				System.out.println(reverse);
				System.out.println(reverse);

				for (int i = 0; i < s.length() / 2; i++)
					{
						char tem = s.charAt(i), last = s.charAt(s.length() - 1 - i);
						char temp = tem;
						tem = last;
						last = temp;
					}
				System.out.println(s);
				String[] x = s.split("@");
				for (String c : x)
					{
						System.out.println(c);
					}
			}
	}
