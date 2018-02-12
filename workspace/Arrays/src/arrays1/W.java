package arrays1;

import java.util.Arrays;

public class W
	{
		public static void main(String[] args)
			{
				int[] x =
					{ 10, 20, 30, 40, 4, 25 };
				int i = Arrays.binarySearch(x, 25);// Array content is not
													// sorted so not giving
													// correct value.
				System.out.println(i);
			}
	}
