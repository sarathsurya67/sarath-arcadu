package Section1;

public class X2
	{
		static int test()
			{
				int i = 10;
				return i;
			}

		public static void main(String[] args)
			{
				test();
				System.out.println(test());
				System.out.println(test() + test());
			}
	}
