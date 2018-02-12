package Section1;

public class Z3
	{
		static int test1(int i) // o- o only 1 - 1
			{
				return i++;
			}

		static int test2(int i) // 0 - 1 , 1 - 2
			{
				return test1(++i);
			}

		static int test3(int i) // 0 - 0 only
			{
				return test1(i++);
			}

		public static void main(String[] args)
			{
				int i = 0;
				int j = test1(i++) + i;
				System.out.println(i);// 1
				System.out.println(j);// 2
				i = j = 0;
				j = test1(++i) + i;
				System.out.println(i);// 1
				System.out.println(j);// 2
				i = j = 0;
				j = test2(++i) + i;
				// 2 +1 = 3
				System.out.println(i);// 1
				System.out.println(j);// 3
				i = j = 0;
				j = test3(++i) + i;
				System.out.println(i);// 1
				System.out.println(j);// 2
				i = j = 0;
				j = test3(++i) + i + test1(i++) + i + test2(i++) + i + test2(++i) + i;
				// 1 + 1+ 1 +2+ 3 +3 + 5 +4=4/20
				System.out.println(i);
				System.out.println(j);
			}
	}
