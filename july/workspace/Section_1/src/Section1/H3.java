package Section1;

public class H3
	{
		static void test(int i)
			{
				System.out.println("from test" + i++);
				System.out.println("from test" + i);
			}

		public static void main(String[] args)
			{
				int i = 10;
				test(i);
				System.out.println("main" + i);
			}
	}