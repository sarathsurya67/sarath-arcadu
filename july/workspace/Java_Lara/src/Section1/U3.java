package Section1;

public class U3
	{
		static int test(int i)
			{
				return i--;
			}

		public static void main(String[] args)
			{
				int i = 0;
				System.out.println(i);// 0
				i = test(i--);
				System.out.println(i);// 0
			}
	}
