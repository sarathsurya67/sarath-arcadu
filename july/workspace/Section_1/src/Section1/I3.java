package Section1;

public class I3
	{
		static void test(boolean flag, int x)
			{
				System.out.println("from test");
				System.out.println(flag);
				System.out.println(x);

			}

		public static void main(String[] args)
			{
				System.out.println("from main");
				test(true, 20);
				System.out.println("..........................");
				boolean f1 = false;
				test(f1, 30);
			}
	}
