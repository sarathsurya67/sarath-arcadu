package Section1;

public class Q3
	{
		static int test(int i)
			{
				return i++;
			}

		public static void main(String[] args)
			{
				int i = 0;
				System.out.println(test(i++));// main method " i " becoming 1
				System.out.println(i);
			}
	}