package Section1;

public class W3
	{
		static int test(int i)
			{
				return ++i;
			}

		public static void main(String[] args)
			{
				int i = 0;
				int j = test(i++) + i + test(++i);//
				// 1 + 1 + 3
				System.out.println(i);// 2
				System.out.println(j);// 5
			}
	}
