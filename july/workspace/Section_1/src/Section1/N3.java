package Section1;

public class N3
	{
		static int test(int i)
			{
				return i--;
			}

		public static void main(String[] args)
			{
				int i = 0;
				System.out.println(i); // 0
				System.out.println(test(i));// 0
				System.out.println(i);// 0
				i = test(i);//
				System.out.println(i);//
			}
	}
