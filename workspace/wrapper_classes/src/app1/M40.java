package app1;

public class M40
	{
		static void test(Float f1)
			{
				System.out.println("float");
			}

		static void test(double d1)
			{
				System.out.println("double");
			}

		public static void main(String[] args)
			{
				long lon = 10;
				test(lon);
			}
	}
