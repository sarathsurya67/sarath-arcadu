package test;

import java.util.Scanner;

public class DupWord
	{
		static Scanner sc;

		public static void main(String[] args)
			{
				sc = new Scanner(System.in);
				String s;
				System.out.println("enter a string");
				s = sc.nextLine();
				String[] x = s.split(" ");
				for (String c : x)
					{
						String t = c;
						System.out.println(c);

					}
			}
	}
