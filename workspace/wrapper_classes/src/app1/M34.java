package app1;

public class M34
	{
		static int test()
			{
				Integer obj = new Integer(20);
				return obj;// return obj.intValue();
			}

		public static void main(String[] args)
			{
				Integer o1 = test();// new Integer(test());
				System.out.println("done");
			}
	}
