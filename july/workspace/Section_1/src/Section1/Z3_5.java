package Section1;

public class Z3_5
	{
		static int test1(int i)
			{
				return ++i;
			}

		static int test2(int i)
			{
				return test1(i++) + test1(++i);
			}

		public static void main(String[] args)
			{
				int i = 1;
				int j = test2(3);
				System.out.println("j=" + j);
			}
	}
