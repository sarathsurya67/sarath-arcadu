package Section1;

public class S3
	{
		static int test(int i)
			{
				return ++i;
			}

		public static void main(String[] args)
			{
				int i = 0;
				System.out.println(test(i++));// 1
				System.out.println(i);// 1
				i = 0;
				System.out.println(test(i--));// 1
				System.out.println(i);// -1
			}
	}
