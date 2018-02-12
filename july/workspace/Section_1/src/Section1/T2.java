package Section1;

public class T2
	{
		static int test()
			{
				System.out.println("from test");
				return 10;
			}

		public static void main(String[] args)
			{
				int i = test();// prnit test restun val assign to i
				int j = 10 + test();// '' ''' ''' '' ' ' '' '' ' '' ''
				System.out.println(test());// first test() ("from test")..immed
											// return val 10
				System.out.println(i);// i val
				System.out.println(j);// j val
				System.out.println(i + j + test());//
			}
	}
