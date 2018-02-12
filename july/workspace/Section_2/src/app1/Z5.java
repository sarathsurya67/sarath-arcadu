package app1;

class Z5
	{
		static int i = test();

		static int test()
			{
				System.out.println(" from test ");
				main(null);
				return 10;
			}

		public static void main(String[] args)
			{
				System.out.println(" From Main ");
				System.out.println(i);
			}
	}
