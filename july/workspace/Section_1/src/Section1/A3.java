package Section1;

public class A3
	{
		static void test(int i)
			{
				System.out.println("from test");
				System.out.println(i);
			}

		public static void main(String[] args)
			{
				System.out.println("from main begin");
				test();
				System.out.println("from main end");
			}
	}
