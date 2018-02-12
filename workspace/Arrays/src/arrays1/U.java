package arrays1;

import java.util.Arrays;

public class U
	{
		public static void main(String[] args)
			{
				String[] x =
					{ "xyz", "test", "hello", "abc", "done" };
				System.out.println(Arrays.toString(x));
				Arrays.sort(x);// def sorting order is A to Z
				System.out.println(Arrays.toString(x));
			}
	}
