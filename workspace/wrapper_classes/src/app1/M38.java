package app1;

public class M38
	{
		static void test(double d1)
			{
				System.out.println("double");
			}

		static void test(Integer obj)
			{
				System.out.println("integer");
			}

		public static void main(String[] args)
			{
				int i = 20;
				test(i);
			}
	}
