package app1;

class F
	{
		int i;

		@Override
		public String toString()// getClass().getName() + '@' +
								// Integer.toHexString(hashCode())
			{
				System.out.println("tostr");
				return "i = " + i;
			}
	}

public class Manager6
	{
		public static void main(String[] args)
			{
				F f1 = new F();
				f1.i = 10;
				System.out.println(f1.i);
				System.out.println(f1);
			}
	}
