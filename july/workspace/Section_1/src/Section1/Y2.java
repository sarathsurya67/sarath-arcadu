package Section1;

public class Y2
	{
		static int test1()
			{
				System.out.println("from test1");
				return 100;
			}

		static int test2()
			{
				System.out.println("from test2");
				return test1();
			}

		public static void main(String[] args)
			{
				test1();
				System.out.println(test2());// fromtest1
											// 10
				System.out.println(test2() + test1());// from test1..from test2
														// 10
			}
	}
