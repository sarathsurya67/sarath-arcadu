package Section1;

class U2
	{
		static int test()
			{
				System.out.println("from test");
				return 10;
			}

		public static void main(String[] args)
			{
				System.out.println("main begin");
				test();
				System.out.println("main end");
			}
	}
