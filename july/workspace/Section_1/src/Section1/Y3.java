package Section1;

public class Y3
	{
		static int test1(int i)
			{
				return i++;
			}

		static int test2(int i)
			{
				return ++i;
			}

		public static void main(String[] args)
			{
				int i = 0;
				int j = i++ + i + test1(i++) + i + ++i + i + test1(++i) + i + ++i + i + test2(++i) + i + i++ + i
						+ test2(i++) + i;
				// 0 + 1 + 1 + 2 + 3 + 3 + 4 + 4 + 5 + 5 + 7 +6 + 6 + 7 + 8
				// +8=8/70

				System.out.println(i);
				System.out.println(j);
			}
	}
