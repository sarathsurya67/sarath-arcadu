package Section1;

public class D3
	{
		static void test(int i)
			{
				System.out.println("from test" + i);
			}

		public static void main(String[] args)
			{
				int m;
				test(m = 10);
				System.out.println("done");
				System.out.println(m);
			}
	}
