package Section1;

public class X3
	{
		static int test(int i)
			{
				return i++;// if u return 1 gives 1 only
			}

		public static void main(String[] args)
			{
				int i = 0;
				int j = i++ + i + test(i++) + ++i + test(i++) + i + --i + test(i--) + i + i + test(i--) + ++i;
				// 1 + 1+ 1 + 3 + 3 + 4 + 3 + 3 + 2 + 2+ 2 + 2 =2/27
				System.out.println(i);
				System.out.println(j);
			}
	}