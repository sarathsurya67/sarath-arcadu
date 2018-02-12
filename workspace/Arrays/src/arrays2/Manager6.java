package arrays2;

import java.util.Arrays;

class E implements Comparable
	{
		int i, j;

		E(int i, int j)
			{
				this.i = i;
				this.j = j;
			}

		@Override
		public String toString()
			{
				return "(" + i + " ," + j + ")";
			}

		@Override
		public int compareTo(Object obj)
			{
				E d1 = (E) obj;
				return j - d1.j;
			}

	}

public class Manager6
	{
		public static void main(String[] args)
			{
				E[] x =
					{ new E(1, 2), new E(9, 0), new E(1, 9), new E(2, 9), new E(1, 3), new E(3, 4) };

				System.out.println(Arrays.toString(x));
				Arrays.sort(x);
				System.out.println(Arrays.toString(x));
			}
	}
